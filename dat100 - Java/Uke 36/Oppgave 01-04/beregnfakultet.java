import java.util.Scanner;

public class beregnfakultet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et heltall n > 0: ");
        int n = input.nextInt();

        long fakultet = 1;

        for (int i = 1; i <= n; i++) {
            fakultet = fakultet * i;
        }

        System.out.println(n + "! = " + fakultet);

        input.close();
    }
}