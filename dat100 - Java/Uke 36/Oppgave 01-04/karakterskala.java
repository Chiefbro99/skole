import java.util.Scanner;

public class karakterskala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv poeng (0-100): ");
        int poeng = input.nextInt();

        if (poeng < 0 || poeng > 100) {
            System.out.println("ugyldig poengsum.");
        } else if (poeng >= 89) {
            System.out.println("Karakter: A");
        } else if (poeng >= 77) {
            System.out.println("Karakter: B");
        } else if (poeng >= 65) {
            System.out.println("Karakter: C");
        } else if (poeng >= 53) {
            System.out.println("Karakter: D");
        } else if (poeng >= 41) {
            System.out.println("Karakter: E");
        } else {
            System.out.println("Karakter: F");
        }

        input.close();
    }
}