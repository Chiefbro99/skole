import java.util.Scanner;

public class karakterskala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            int poeng;

            // Les inn på nytt til poengsummen er gyldig
            do {
                System.out.print("Student " + i + " - poengsum (0-100): ");
                poeng = input.nextInt();

                if (poeng < 0 || poeng > 100) {
                    System.out.println("Ugyldig poengsum, prøv igjen.");
                }
            } while (poeng < 0 || poeng > 100);

            // Her er poeng garantert mellom 0 og 100
            if (poeng >= 89) {
                System.out.println("Student " + i + " får karakter A");
            } else if (poeng >= 77) {
                System.out.println("Student " + i + " får karakter B");
            } else if (poeng >= 65) {
                System.out.println("Student " + i + " får karakter C");
            } else if (poeng >= 53) {
                System.out.println("Student " + i + " får karakter D");
            } else if (poeng >= 41) {
                System.out.println("Student " + i + " får karakter E");
            } else {
                System.out.println("Student " + i + " får karakter F");
            }
        }

        input.close();
    }
}