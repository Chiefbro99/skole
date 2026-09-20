import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // Oppretter en Scanner for å lese hva brukeren skriver i terminalen
        Scanner minScanner = new Scanner(System.in);
        
        System.out.print("Skriv inn ditt navn: ");
        String navn = minScanner.nextLine(); // Venter på tekst fra brukeren
        System.out.print("Skriv inn ditt telefonnummer: ");
        String telefonnummer = minScanner.nextLine();
        System.out.print("Hjemmeadresse: ");
        String addresse = minScanner.nextLine();
        
        
        System.out.println("Hei, " + navn + "!");
        System.out.println("Ditt tlf: " + telefonnummer);
        System.out.println("Hjemmeadresse: " + addresse);
        
        minScanner.close(); // Lukker scanneren etter bruk
    }
}

