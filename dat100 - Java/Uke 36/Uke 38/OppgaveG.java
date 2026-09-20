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
       
       
    }
    
    public static void skrivUt(int[] tabell) {
       //Oppgave d og e
       //Skriv ut innholdet ved bruk av en for-løkke med indeks
       for (int i : tabell) {
           System.out.print(x + " ");
       }
       System.out.println();
    }
}




