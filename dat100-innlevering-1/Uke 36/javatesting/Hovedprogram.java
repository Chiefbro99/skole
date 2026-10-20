/*
 * Hovedprogram.java
 *
 * Filnavnet MÅ være likt navnet på den public-klassen som ligger i filen.
 * Java krever dette for at kompilatoren skal finne klassen igjen på disk.
 */

// "public" = tilgjengelig utenfra. "class" = en mal/beholder for kode og data.
// Alt i Java må ligge inne i en klasse — det finnes ingen "løs" kode på toppnivå.
public class Hovedprogram {

    /*
     * main() er inngangsdøra. JVM (Java Virtual Machine) leter etter akkurat
     * denne signaturen når programmet startes:
     *   public  -> JVM må få lov til å kalle den utenfra
     *   static  -> kan kjøres uten at vi først lager et objekt av klassen
     *   void    -> returnerer ingenting
     *   String[] args -> argumenter fra kommandolinja, f.eks. "java Hovedprogram hei"
     */
    public static void main(String[] args) {

        // ---------- 1. VARIABLER OG DATATYPER ----------
        // Java er statisk typet: du sier hva slags data variabelen holder,
        // og kompilatoren stopper deg hvis du bryter det senere.
        // Dette er grunnen til at Java fanger mange feil FØR programmet kjører.

        int alder = 32;              // heltall
        double timepris = 850.50;    // desimaltall
        boolean erStudent = false;    // sant/usant
        String navn = "Chris";       // tekst (merk stor S — String er en klasse, ikke en primitiv type)
        char initial = 'C';          // ett enkelt tegn, enkle fnutter

        // + mellom String og andre verdier limer sammen til én tekst
        System.out.println("Hei, " + navn + " (" + initial + "), " + alder + " år.");
        System.out.println("Timepris: " + timepris + " kr");


        // ---------- 2. BETINGELSER (if / else) ----------
        // && betyr "og", || betyr "eller", ! betyr "ikke".
        // Java sjekker fra toppen og hopper ut ved første treff.
        if (erStudent && alder < 30) {
            System.out.println("Du får studentrabatt.");
        } else if (erStudent) {
            System.out.println("Student, men over aldersgrensa.");
        } else {
            System.out.println("Full pris.");
        }


        // ---------- 3. LØKKER ----------
        // for-løkke brukes når du vet hvor mange ganger du skal gjenta.
        // Tre deler: start (int i = 1), betingelse (i <= 3), steg (i++).
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runde nr. " + i);
        }

        // while brukes når du IKKE vet antallet på forhånd — bare betingelsen.
        // Husk å endre variabelen inni, ellers løper løkka evig.
        int teller = 0;
        while (teller <= 2) {
            System.out.println("While-runde " + teller);
            teller++;   // samme som teller = teller + 1
        }


        // ---------- 4. ARRAY (liste med fast lengde) ----------
        String[] oppgaver = {"Lese Java", "Trene", "Fakturere kunde"};

        // "for-each": les som "for hver oppgave i oppgaver".
        // Bruk denne når du bare skal gå gjennom alt og ikke trenger indeksen —
        // da kan du ikke bomme på tellingen (klassisk kilde til feil).
        System.out.println("");
        
        for (String oppgave : oppgaver) {
            System.out.println("- " + oppgave);
        }
        System.out.println("");
        
        for (int i = 0; i < oppgaver.length; i++) {
            System.out.println((i + 1) + ". " + oppgaver[i]);   // 1. Lese Java
        }
    System.out.println("");

        // ---------- 5. METODER ----------
        // Vi kaller vår egen metode lenger nede i klassen.
        // Poenget med metoder: gi et navn til noe kode, og gjenbruke den.
        double sum = leggSammen(1000, 250);
        System.out.println("Sum: " + sum + " kr");


        // ---------- 6. OBJEKTER ----------
        // "new Kunde(...)" lager et objekt basert på malen (klassen) Kunde.
        // Variabelen kunde peker på objektet i minnet.
        Kunde kunde = new Kunde("Bakeriet AS", 12000);
        kunde.skrivUtInfo();

        kunde.leggTilKjop(3000);   // vi endrer tilstanden inne i objektet
        kunde.skrivUtInfo();
    }

    /*
     * Egen metode.
     * static  -> hører til klassen, ikke til et objekt. Må være static her fordi
     *            main er static og kaller den direkte.
     * double  -> returtypen, altså hva som kommer tilbake
     * (double a, double b) -> parametrene, verdiene metoden trenger for å jobbe
     */
    private static double leggSammen(double a, double b) {
        return a + b;   // return sender verdien tilbake og avslutter metoden
    }
}


/*
 * En klasse til i samme fil. Den kan IKKE være public — bare én public klasse
 * per fil (den som matcher filnavnet). I ekte prosjekter legger man som regel
 * hver klasse i sin egen fil.
 */
class Kunde {

    // Felt = data som hvert objekt bærer med seg.
    // private betyr at ingen utenfra kan røre dem direkte. Det kalles innkapsling,
    // og poenget er at klassen selv bestemmer reglene for hvordan data endres.
    private String navn;
    private double omsetning;

    /*
     * Konstruktør: kjøres automatisk når du skriver "new Kunde(...)".
     * Den har samme navn som klassen og ingen returtype.
     * Jobben er å sette objektet i en gyldig starttilstand.
     */
    public Kunde(String navn, double omsetning) {
        // "this.navn" er feltet, "navn" er parameteren.
        // this brukes for å skille dem når de heter det samme.
        this.navn = navn;
        this.omsetning = omsetning;
    }

    // Ikke static: denne metoden hører til ETT bestemt objekt og jobber på dets data.
    public void leggTilKjop(double belop) {
        if (belop <= 0) {
            System.out.println("Beløpet må være positivt.");
            return;   // avbryter metoden tidlig — resten kjøres ikke
        }
        this.omsetning += belop;   // += legger til på eksisterende verdi
    }

    // void = returnerer ingenting, den bare skriver ut.
    public void skrivUtInfo() {
        System.out.println(navn + " har handlet for " + omsetning + " kr.");
    }
}