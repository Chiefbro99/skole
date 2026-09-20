/* Denne koden lager en tabell med heltall og skriver det ut på 2 måter*/
import java.util.Arrays;

public class OppgaveG {
    public static void main(String[] args) {
        //oppgave a
        int[] tabell = {1,3,4,7,9,10};
        //Utskrift1
        System.out.println(Arrays.toString(tabell));
        
        //utskrift2
        for (int x : tabell) {
            System.out.print(x + " ");
        }
       
        System.out.println();
       
        //Oppgave b
        System.out.println(tabell[2]);   // 4
       
        //Oppgave c
        tabell[2] = 7;
        System.out.println(Arrays.toString(tabell));
        //Eller
        tabell[2] = 5;
        for (int x : tabell) {
            System.out.print(x + " ");
        }
        System.out.println();
        //Skriver ut oppgave d
        skrivUt(tabell);
       
        System.out.println(finnes(tabell, 7));   // true
        System.out.println(finnes(tabell, 3));   // true
    }
    
    public static void skrivUt(int[] tabell) {
        //Oppgave d og e
        //Skriv ut innholdet ved bruk av en for-løkke med indeks
        for (int i : tabell) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //oppgave g
    public static boolean finnes(int[] tabell, int tall) {
        int i = 0;
        
        //To betingelser: Vi er fortsatt innenfor tabellen OG vi har ikke funnet tallet
        while (i < tabell.length) {
            if (tabell[i] == tall) {
                System.out.println("Fant " + tall + " på posisjon " + i);
                return true; //funnet - hopp ut av metoden med en gang
            }
            i++; //må stå her, ellers går løkka evig
        }
        //kommer vi hit, har vi sett gjennom hele tabellen uten treff
        System.out.println(tall + " finnes ikke i tabellen.");
        return false; 
    } 
    
    public static int[] skiftfortegn (int[] tabell) {
        //Lag et nytt arr
    }
}




