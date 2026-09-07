public class skrivstjerner_for {

    private static final String SKILLELINJE_TEGN = "-";
    private static final int SKILLELINJE_LENGDE = 40;

    public static void main(String[] args) {
        skrivSkillelinje();
        System.out.println("Velkommen");
        skrivSkillelinje();

        System.out.println("");

        String[] tegn = {"A", "B", "C"};
        int[] antall = {5, 2, 12};

        for (int i = 0; i < tegn.length; i++) {
            skrivTegn(tegn[i], antall[i]);
        }

        skrivSkillelinje();
        skrivTrekant("*", 10);
        skrivSkillelinje();
        
    }
    
    private static void skrivSkillelinje() {
        skrivTegn(SKILLELINJE_TEGN, SKILLELINJE_LENGDE);
    }

    private static void skrivTegn(String tegn, int antall) {
        System.out.println(tegn.repeat(antall));
    }
    

    private static void skrivTrekant(String tegn, int høyde) {
        System.out.println("");
        for (int rad = 1; rad <= høyde; rad++) {
            skrivTegn(tegn, rad);
        }
    }
}