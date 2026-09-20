/*
 * Datatabell.java
 *
 * Viser forskjellen på å endre primitive verdier og objekter i en for-each-løkke.
 */

public class Datatabell {

    public static void main(String[] args) {

        // Arrayet lages med tre TOMME plasser - alle inneholder null nå.
        Data[] tab = new Data[10];

        // Her fyller vi plassene med faktiske objekter.
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Data(i + 1);
        }

        // Skriv ut før endring.
        // System.out.print(d) kaller automatisk d.toString() for å få tekst.
        for (Data d : tab) {
            System.out.print(d + " ");
        }
        System.out.println();   // uten argument = bare linjeskift

        /*
         * Oppdater. Dette VIRKER, i motsetning til x = x + 1 på en int-tabell.
         *
         * d inneholder en kopi av ADRESSEN til objektet, og den adressen
         * peker på samme objekt som tab[i] gjør. Når vi kaller setData(),
         * følger vi adressen fram og endrer objektet der det ligger.
         * Arrayet ser endringen fordi det er ett og samme objekt.
         */
        for (Data d : tab) {
            d.setData(d.getData() + 1);
        }

        // Skriv ut etter endring.
        for (Data d : tab) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}


/*
 * Egen klasse på toppnivå - utenfor Datatabell sine krøllparenteser.
 * Ikke public, fordi bare klassen som matcher filnavnet kan være det.
 */
class Data {

    // private: bare Data selv kan røre feltet direkte.
    private int data;

    public Data(int data) {
        this.data = data;   // this.data er feltet, data er parameteren
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    /*
     * toString() finnes allerede i Object, som alle klasser arver fra.
     * Standardversjonen gir "Data@1b6d3586" - klassenavn og minneadresse.
     * Ved å overstyre den bestemmer vi selv hvordan objektet ser ut som tekst.
     *
     * "" + data limer tallet på en tom streng, som er en kortform for
     * å konvertere int til String.
     */
    @Override
    public String toString() {
        return "" + data;
    }
}