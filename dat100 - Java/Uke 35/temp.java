import java.util.Scanner;
public class temp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        for (int i = 1; i<=5; i++) {
            System.out.println("PPM: ");
            
            int co2 = input.nextInt();
            
            if (co2 < 500) {
                System.out.println("GRØNN");
            } else {
                    System.out.println("RØD");
            }
           
        }
        
        input.close();
        
       for (int a = 0; a < 6; a++) {
           if (a % 2 != 0) {
               System.out.println(a);
           }
       }
    }
}
