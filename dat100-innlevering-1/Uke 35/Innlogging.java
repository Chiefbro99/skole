public class Innlogging {
    public static void main(String[] args) {
        // Demovariabler for å simulere en lagret bruker
        String registrertBrukernavn = "student";
        String registrertPassord = "java123";
        boolean fortsett = true;

        IO.println("=== ENKELL Innlogging ===");

        while (fortsett) {
            // Skriver ut en enkel meny
            IO.println("\nVelg en bokstav:");
            IO.println("i = Logg inn");
            IO.println("b = Endre Passord");
            IO.println("q = Avslutt");
            IO.print("Ditt valg: ");

            // Leser valget som en tekststreng
            String valg = IO.readln();

            switch (valg) {
                case "i":
                    IO.print("Brukernavn: ");
                    String bruker = IO.readln();
                    IO.print("Passord: ");
                    String pass = IO.readln();

                    if (bruker.equals(registrertBrukernavn) && pass.equals(registrertPassord)) {
                        IO.println("Suksess! Du er logget inn.");
                    } else {
                        IO.println("Feil brukernavn eller passord.");
                    }
                    break;

                case "b":
                    // Det læreren din viste deg:
                    IO.println("--- Endre Passord ---");
                    IO.print("Skriv inn nytt passord: ");
                    registrertPassord = IO.readln();
                    IO.println("Passordet ble endret!");
                    break;

                case "q":
                    IO.println("Avslutter programmet...");
                    fortsett = false;
                    break;

                default:
                    IO.println("Ugyldig bokstav, prøv igjen.");
                    break;
            }
        }
    }
}
