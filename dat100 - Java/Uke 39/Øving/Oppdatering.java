/* Denne koden skal oppdatere en array */
public class Oppdatering {
    public static void main(String[] args) {
        System.out.println("Hei fra Oppdatering!");
        
        int[] tab = {1,2,3,4,5,6};
        
        //skriv ut første array.
        for (int x : tab) {
            System.out.print(x + " ");
        }
        
        //skriv ut oppdatert array
        
        for (int x : tab) {
            x = x + 1;
        }
        
        System.out.println("");
        
        for (int x : tab) {
            System.out.print(x + " ");
        }
    }
}