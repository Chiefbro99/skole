import java.util.Scanner;

public class trinnskatt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        double inntekt = input.nextDouble();

        double skatt = 0.0;

        // Trinn 1: 1,7 % av det som ligger mellom 226 100 og 318 300
        if (inntekt > 226100) {
            skatt = skatt + (Math.min(inntekt, 318300) - 226100) * 0.017;
        }

        // Trinn 2: 4,0 % av det som ligger mellom 318 300 og 725 050
        if (inntekt > 318300) {
            skatt = skatt + (Math.min(inntekt, 725050) - 318300) * 0.040;
        }

        // Trinn 3, 4 og 5 skriver du selv etter samme mønster.
        // Siste trinn har ingen øvre grense — hva betyr det for Math.min-linjen?

        System.out.println("Trinnskatt: " + skatt + " kr");

        input.close();
    }
}