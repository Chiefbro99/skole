// Obligatorisk skoleprøve i DAT100 - UKE 37 DEL2
import java.util.Scanner;

public class prove {

    public static void main(String[] args) {

        // === Oppgave 1a ===
        int a = 7;
        if (a <= 0 || a >= 0) {
            System.out.println("Oppgave 1a)");
            System.out.println("Tallet er: " + a);
        }
        
        System.out.println("");

        // === Oppgave 1b ===
        int b = 4;
        if (b >= 5 && b <= 8) {
            System.out.println("Oppgave 1b)");
            System.out.println("- " + b + " er innenfor intervallet");
        } else {
            System.out.println("Oppgave 1b)");
            System.out.println(b + " er utenfor intervallet");
        }
        
        System.out.println("");

        // === Oppgave 1c ===
        String s = "tomt";
        int verdi = 3;
        switch (verdi) {
            case 0:
                s = "Null";
                break;
            case 1:
                s = "En";
                break;
            case 2:
                s = "To";
                break;
            case 3:
                s = "Tre";
                break;
            case 4:
                s = "Fire";
                break;
            default:
                s = "Ulovlig verdi";
                break;
        }
        
        System.out.println("Oppgave 1c)");
        System.out.println(s);

        // === Oppgave 5b: kaller arealSirkel() — metoden står nederst ===
        double areal = arealSirkel(1.5);
        System.out.println("Oppgave 5b)");
        System.out.println("Arealet av sirkelen er: " + areal);

        // === Oppgave 3: summerer heltall til brukeren skriver 0 ===
        Scanner tastatur = new Scanner(System.in);

        System.out.println("");
        
        // === Oppgave 4b: kaller min() — metoden står nederst ===
        int x = 4, y = 5, z = 8;
        int minste = min(x, y, z);
        System.out.println("Oppgave 4b)");
        System.out.println("Det minste tallet er av; " + x + ", " + y + ", " + z + ", " + "er: " + minste);
        
        System.out.println("");

        int antall = 0;
        int sum = 0;
        int tallVerdi;

        do {
            System.out.print("Skriv et tilfeldig heltall; (0 avslutter): ");
            String tall = tastatur.nextLine();
            tallVerdi = Integer.parseInt(tall);

            if (tallVerdi != 0) {
                sum = sum + tallVerdi;
                antall = antall + 1;
            }

        } while (tallVerdi != 0);

        System.out.println("Antall tall: " + antall);
        System.out.println("Sum: " + sum);
        
        tastatur.close();
        
        System.out.println("");
         
    }

    // === Oppgave 4a: finner det minste av tre heltall ===
    public static int min(int x, int y, int z) {
        int m = x;
        if (y < m) {
            m = y;
        }
        if (z < m) {
            m = z;
        }
        return m;
    }
    
    // === Oppgave 5a: regner ut arealet av en sirkel ===
    public static double arealSirkel(double radius) {
        return Math.PI * radius * radius;
    }
}