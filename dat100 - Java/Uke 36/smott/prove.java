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
                s = null;
                break;
            case 1:
                s = en;
                break;
            case 2:
                s = to;
                break;
            case 3:
                s = tre;
                break;
            case 4: 
                s = fire;
                break;
            default:
                s = ulovlig verdi;
                break;
        }
        
        //Oppgave 2 
        //Finn ukjent heltall return; 
        Scanner tastatur = new Scanner(System.in);
        
        int antall = 0;
        int sum = 0;
        int tall;
        
        do {
            String tallStreng = showInputDialog("Forklarende tekst");
            
        } while ();
    }
}
