
public class temp1 {
    public static void main(String[] args) {
        
        int[] temp = {12, 15, 9, 21, 18, 7};
        System.out.println("Oppgave1");
        System.out.print("[ ");

        for (int x : temp) {
        System.out.print(x + ", ");
        }
        System.out.println("]");
        
        System.out.println("");
        
        
        //Tvinge alt inn i forløkke:
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) System.out.print("[ ");
        System.out.print(temp[i] + ", ");
            if (i == temp.length - 1) System.out.print("]");
        }
        System.out.println();
        
        System.out.println("Oppgave2");
        
        //Skriv om fra celcius til farenheit.
        int f = c * 9 / 5 + 32;
        for (int f < temp.length) {
            System.out.print("test");
        }
    }
}
