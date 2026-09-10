//Obligatorisk skoleprøve i DAT100 - UKE 37 DEL2
public class prove {
    public static void main(String[] args) {
        //Oppgave 1 (vekt 20%)
        //a)
        int a = 7;
        if (a <= 0 || a >= 0) {
            System.out.println(a);
        }
        
        
        //b)
        if (a >= 5 && a <= 8) {
            System.out.print(a + " er innenfor intervallet");
        } else {
            System.out.print(a + " er utenfor intervallet");
        }
        
        //c)
        
        String s = "tomt";
        int verdi = 3;
        switch (verdi) {
            case 0:
                s = "null";
                break;
            case 1:
                s = "en";
                break;
            case 2:
                s = "to";
                break;
            case 3:
                s = "tre";
                break;
            case 4: 
                s = "fire";
                break;
            default:
                s = "ulovlig verdi";
                break;
        }
        
        //Oppgave 2 
        //Finn ukjent heltall return; 
        Scanner tastatur = new Scanner(System.in);
        
        int antall = 0;
        int sum = 0;
        int tallVerdi;
        
        do {
            System.out.print("Skriv et heltall: ");
            String tall = tastatur.nextLine();
            tallVerdi = Integer.parseInt(tall);    
            
            if (tallverdi != 0) {
                sum = sum + tallVerdi;
                antall = antall + 1;
            }
            
        } while (tallverdi != 0);
        
        System.out.print("Antall tall: " + antall);
        System.out.print("Sum: " + sum);
        
        //Oppgave 4
        //Gjør om double til int for heltall og legger til z siden vi skal finne en metode av tre heltall
        public static int min(int x, int y, int z) {
            int m = x;
            if (y > m) {
                m = y;
            }
            
            if (z < m) {
                m = z;
            }
            
            return m;
        }
        
        //3 heltall + skriver ut minste
        int a = 4, b = 5, c = 8;
        int minste = min(a,b,c);
        System.out.print("Det minste tallet er " + minste);
        
        //oppgave 5
        
        double areal = arealSirkel(1.5);
        System.out.print("Arealet av sirkelen er: " + areal);
        
        public static double arealSirkel(double radius);
        return Math.PI * radius * radius;
    }
    
}
