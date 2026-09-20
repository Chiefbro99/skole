/* Denne koden skal oppdatere en array x ganger, i samme for løkke istedenfor å skrive ut manuelt hver gang*/
public class Oppdatering2 {
    public static void main(String[] args) {
        System.out.println("Hei fra Oppdatering!");
        
        int[] tab = {1,2,3,4,5,6};
        
        //skriv ut første array.
        skrivUt(tab); //1 2 3 4 5 6
        
        
        //skriv ut oppdatert array
        
        for (int runde = 0; runde < 7; runde++) {
            for (int x = 0; x < tab.length; x++) {
                tab[x]++;
            }
            skrivUt(tab); //2 3 4 5 6 7 og så 3 4 5 6 7 8
            
        }
        
    }
    
    private static void skrivUt(int[] tab) {
        System.out.print("[ ");
        for (int x : tab) {
            System.out.print(x + " ");
        }
        System.out.println("]");
    }
}