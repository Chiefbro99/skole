import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // Oppretter en Scanner for å lese hva brukeren skriver i terminalen
        Scanner minScanner = new Scanner(System.in);
        
        System.out.print("Skriv inn ditt navn: ");
        String navn = minScanner.nextLine(); // Venter på tekst fra brukeren
        
        System.out.println("Hei, " + navn + "!");
        
        minScanner.close(); // Lukker scanneren etter bruk
    }
}
