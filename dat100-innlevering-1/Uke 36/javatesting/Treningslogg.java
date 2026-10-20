/*
 * Treningslogg.java
 *
 * Et interaktivt konsollprogram som lagrer treningsøkter og tegner dem
 * som søylediagram i terminalen.
 *
 * Kjør slik:
 *   javac Treningslogg.java
 *   java Treningslogg
 */

// import henter inn klasser som ikke ligger i java.lang (som String og System,
// de er alltid tilgjengelige). Scanner ligger i pakken java.util, så vi må si fra.
import java.util.Scanner;

public class Treningslogg {

    /*
     * FELT PÅ KLASSENIVÅ
     *
     * Disse ligger utenfor main, slik at alle metodene i klassen kan bruke dem.
     * De er static fordi metodene våre er static — en static metode kan bare
     * røre static felt, siden den kjører uten at noe objekt finnes.
     *
     * final betyr at verdien ikke kan endres etter at den er satt. Konstanter
     * skrives med STORE_BOKSTAVER etter konvensjon, så leseren ser med én gang
     * at dette er en fast verdi og ikke noe som varierer.
     */
    private static final int MAKS_OKTER = 20;
    private static final int SOYLE_BREDDE = 30;   // maks antall tegn i en søyle

    // Et array med plass til 20 Okt-objekter. Merk: arrayet er laget nå,
    // men alle plassene inneholder null til vi fyller dem.
    private static Okt[] okter = new Okt[MAKS_OKTER];

    // Hvor mange plasser vi faktisk har fylt. Vi kan IKKE bruke okter.length,
    // for den er alltid 20 uansett hvor mange økter vi har lagt inn.
    // Dette er prisen for arrays med fast størrelse - vi må telle selv.
    private static int antallOkter = 0;

    // Én Scanner for hele programmet. Lager du en ny hver gang du skal lese,
    // ender du med flere som slåss om den samme input-strømmen (System.in).
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        leggInnDemodata();   // så diagrammet har noe å vise med én gang

        System.out.println("=======================================");
        System.out.println("           TRENINGSLOGG");
        System.out.println("=======================================");

        // Hovedløkka. En boolean styrer om vi skal fortsette.
        // while brukes her fordi vi ikke vet hvor mange valg brukeren tar.
        boolean kjorer = true;

        while (kjorer) {
            skrivMeny();

            // .trim() fjerner mellomrom og linjeskift i begge ender.
            // Uten den blir "1 " noe annet enn "1", og menyen slutter å virke.
            String valg = scanner.nextLine().trim();

            // .equals() og ikke ==, fordi valg er bygget fra tastetrykk
            // under kjøring og aldri vil peke på samme objekt som "1" i koden.
            if (valg.equals("1")) {
                leggTilOkt();
            } else if (valg.equals("2")) {
                visDiagram();
            } else if (valg.equals("3")) {
                visProgresjon();
            } else if (valg.equals("4")) {
                visBaklengs();
            } else if (valg.equalsIgnoreCase("q")) {
                // equalsIgnoreCase: både "q" og "Q" godtas.
                System.out.println("\nHa en god økt!");
                kjorer = false;   // betingelsen i while blir false -> løkka slutter
            } else {
                System.out.println("Ukjent valg: " + valg);
            }
        }

        scanner.close();   // rydder opp ressursen når vi er ferdige
    }


    // ---------------------------------------------------------------
    //  MENY OG INNLESING
    // ---------------------------------------------------------------

    private static void skrivMeny() {
        // \n er et linjeskift inni teksten. print (uten ln) lar markøren
        // stå på samme linje, slik at brukeren skriver rett bak pilen.
        System.out.println("\n1) Legg til økt");
        System.out.println("2) Vis diagram");
        System.out.println("3) Vis progresjon");
        System.out.println("4) Vis siste økter først");
        System.out.println("q) Avslutt");
        System.out.print("> ");
    }

    private static void leggTilOkt() {
        // Sjekk plassen FØR vi spør. Uten denne krasjer programmet med
        // ArrayIndexOutOfBoundsException på økt nummer 21.
        if (antallOkter >= MAKS_OKTER) {
            System.out.println("Loggen er full (" + MAKS_OKTER + " økter).");
            return;   // hopper ut av metoden med en gang
        }

        System.out.print("Øvelse: ");
        String ovelse = scanner.nextLine().trim();

        if (ovelse.isEmpty()) {   // isEmpty() er true hvis lengden er 0
            System.out.println("Øvelsen må ha et navn.");
            return;
        }

        double vekt = lesDesimaltall("Vekt (kg): ");
        int reps = (int) lesDesimaltall("Reps: ");

        // Legg objektet på første ledige plass, og øk telleren.
        // antallOkter er alltid indeksen til neste ledige bås:
        // med 3 økter er indeks 0,1,2 tatt, og 3 er ledig.
        okter[antallOkter] = new Okt(ovelse, vekt, reps);
        antallOkter++;

        System.out.println("Lagret. Du har nå " + antallOkter + " økter.");
    }

    /*
     * Leser et tall fra brukeren, og gir seg ikke før hun skriver noe gyldig.
     *
     * Hvorfor nextLine() + parseDouble, og ikke scanner.nextDouble()?
     * nextDouble() plukker tallet, men lar linjeskiftet ligge igjen i køen.
     * Neste nextLine() spiser da bare det tomme linjeskiftet og går videre
     * uten å stoppe. Det er en klassisk Java-felle. Leser du ALLTID hele
     * linjer og konverterer selv, finnes ikke problemet.
     */
    private static double lesDesimaltall(String sporsmal) {
        while (true) {   // "evig" løkke - vi kommer ut via return
            System.out.print(sporsmal);

            // Norske tastaturer gir komma. parseDouble krever punktum,
            // så vi bytter det ut før vi prøver.
            String linje = scanner.nextLine().trim().replace(',', '.');

            /*
             * try/catch: vi PRØVER noe som kan gå galt.
             * Går det bra, returnerer vi og løkka er over.
             * Kaster parseDouble et NumberFormatException (brukeren skrev "abc"),
             * hopper programmet ned i catch i stedet for å krasje.
             */
            try {
                return Double.parseDouble(linje);
            } catch (NumberFormatException e) {
                System.out.println("  '" + linje + "' er ikke et tall. Prøv igjen.");
            }
        }
    }


    // ---------------------------------------------------------------
    //  VISNING
    // ---------------------------------------------------------------

    private static void visDiagram() {
        if (antallOkter == 0) {
            System.out.println("Ingen økter registrert ennå.");
            return;
        }

        // Steg 1: finn det største volumet, så vi vet hva vi skal måle mot.
        // Standardtriks: start med det første elementet som "beste hittil",
        // og bytt hver gang vi finner noe større.
        double maksVolum = okter[0].volum();
        for (int i = 1; i < antallOkter; i++) {
            if (okter[i].volum() > maksVolum) {
                maksVolum = okter[i].volum();
            }
        }

        System.out.println("\nVOLUM PER ØKT (vekt x reps)");
        System.out.println("---------------------------------------");

        // Steg 2: tegn én linje per økt. Her holder for-each, fordi vi
        // bare skal lese - men arrayet har tomme plasser bakerst, så vi
        // må bruke indeks og stoppe på antallOkter.
        for (int i = 0; i < antallOkter; i++) {
            Okt okt = okter[i];

            // Regn om volumet til en søylelengde mellom 1 og SOYLE_BREDDE.
            // Vi deler på det største for å få en andel (0.0-1.0), og ganger opp.
            double andel = okt.volum() / maksVolum;
            int lengde = (int) Math.round(andel * SOYLE_BREDDE);
            if (lengde < 1) {
                lengde = 1;   // så den minste økta fortsatt synes
            }

            // "█".repeat(n) gjentar tegnet n ganger (Java 11 og nyere).
            String soyle = "█".repeat(lengde);

            /*
             * printf formaterer i stedet for å lime sammen med +.
             *   %-12s -> tekst, venstrejustert, minst 12 tegn bred
             *   %-30s -> søyla, med luft bak så tallene havner på linje
             *   %.0f  -> desimaltall uten desimaler
             *   %n    -> linjeskift
             * Poenget er at kolonnene står rett under hverandre.
             */
            System.out.printf("%-12s %-30s %.0f kg%n",
                    okt.getOvelse(), soyle, okt.volum());
        }
    }

    private static void visProgresjon() {
        if (antallOkter < 2) {
            System.out.println("Trenger minst to økter for å se progresjon.");
            return;
        }

        System.out.println("\nENDRING FRA ØKT TIL ØKT");
        System.out.println("---------------------------------------");

        /*
         * Her er mønsteret med naboer: vi rører både [i] og [i + 1],
         * derfor må løkka stoppe én tidligere (- 1). Med 4 økter finnes
         * det 3 overganger: 0->1, 1->2, 2->3.
         */
        for (int i = 0; i < antallOkter - 1; i++) {
            Okt fra = okter[i];
            Okt til = okter[i + 1];

            double endring = til.volum() - fra.volum();

            // Ternary operator: betingelse ? verdiHvisSant : verdiHvisUsant.
            // En kompakt if/else som gir tilbake en verdi.
            String pil = endring > 0 ? "opp  " : endring < 0 ? "ned  " : "likt ";

            // Math.abs gir absoluttverdi, så vi slipper minustegn i utskriften.
            System.out.printf("%-12s -> %-12s %s %.0f kg%n",
                    fra.getOvelse(), til.getOvelse(), pil, Math.abs(endring));
        }
    }

    private static void visBaklengs() {
        if (antallOkter == 0) {
            System.out.println("Ingen økter registrert ennå.");
            return;
        }

        System.out.println("\nSISTE ØKTER FØRST");
        System.out.println("---------------------------------------");

        /*
         * Baklengs: start på siste fylte indeks (antallOkter - 1),
         * fortsett så lenge i er 0 eller høyere, tell nedover.
         * Bruker du i > 0 her, mister du den aller første økta.
         */
        for (int i = antallOkter - 1; i >= 0; i--) {
            System.out.println((i + 1) + ". " + okter[i].beskrivelse());
        }
    }

    private static void leggInnDemodata() {
        okter[0] = new Okt("Knebøy", 80, 25);
        okter[1] = new Okt("Markløft", 100, 18);
        okter[2] = new Okt("Benkpress", 60, 30);
        antallOkter = 3;   // telleren MÅ stemme med hvor mange vi la inn
    }
}


/*
 * En egen klasse for én treningsøkt.
 *
 * Poenget med klassen: uten den måtte vi hatt tre parallelle arrays
 * (ett for øvelse, ett for vekt, ett for reps) og selv passet på at
 * indeks 2 betydde det samme i alle tre. Klassen holder dataene som
 * hører sammen, samlet.
 */
class Okt {

    // private: ingen utenfra kan endre disse direkte.
    // final: de settes i konstruktøren og kan aldri endres etterpå.
    // Et objekt som ikke kan endres er lettere å stole på.
    private final String ovelse;
    private final double vekt;
    private final int reps;

    public Okt(String ovelse, double vekt, int reps) {
        this.ovelse = ovelse;   // this.ovelse er feltet, ovelse er parameteren
        this.vekt = vekt;
        this.reps = reps;
    }

    /*
     * Getters. Siden feltene er private, er dette veien inn for andre klasser.
     * Det virker som unødvendig omvei nå, men gevinsten er at DU bestemmer
     * hva som slippes ut - og kan endre lagringen innvendig senere uten at
     * resten av programmet merker det.
     */
    public String getOvelse() {
        return ovelse;
    }

    /*
     * Utregnet verdi. Vi lagrer ikke volum som eget felt, vi regner det ut
     * ved behov. Da kan det aldri komme i utakt med vekt og reps.
     */
    public double volum() {
        return vekt * reps;
    }

    public String beskrivelse() {
        return String.format("%s - %.1f kg x %d reps = %.0f kg totalt",
                ovelse, vekt, reps, volum());
    }
}