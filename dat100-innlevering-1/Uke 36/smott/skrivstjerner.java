public class skrivstjerner {
    
    private static final String SKILLELINJE_TEGN = "*";
    private static final int SKILLELINJE_LENGDE = 9;
            
    public static void main(String[] args) {
        skrivSkillelinje();
        IO.println("Velkommen");
        skrivSkillelinje();
        
        System.out.println("");
        
        skrivTegn("?", 5);
        skrivTegn("#", 2);
        skrivTegn("*", 12);
    }
    
    public static void skrivTegn(String tegn, int antall) {
        System.out.println(tegn.repeat(antall));
    }
    
    private static void skrivSkillelinje() {
        skrivTegn(SKILLELINJE_TEGN, SKILLELINJE_LENGDE);
    }

}