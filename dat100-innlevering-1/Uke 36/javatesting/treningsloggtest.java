public class treningsloggtest {
    private static final int MAKS_OKTER = 20; /*Setter maks antall økter*/
    private static final int SOYLE_BREDDE = 30; /*Setter maks bredde på søyler*/
        
        
    private static Okt[] okter = new Okt[MAKS_OKTER]; //Setter array "Okt" til å legge til nye økter
    
    private static int antallØkter = 0; //For arrays med fast størrelse må vi telle selv
    
    private static Scanner scanner = new Scanner(System.in); //Scanner for hele programmet. 
     
    public static void main(String[] args) {
        leggInnDemodata(); //demodata
        
        System.out.print("========================");
        System.out.print("TRENINGSLOGG DEMO");
        System.out.print("========================");
        
        boolean kjorer = true; //Hovedløkka kjorer styrer om vi skal fortsette
        
        while (kjorer) { //while brukes fordi vi ikke vet hvor mange valg brukeren tar
            skrivMeny();
            
            String valg = scanner.nextline().trim(); //trim fjerner mellomrom og linjeskift i begge ender
            //String valg glemmes når while løkka er ferdig (standard)
            
            if (valg.equals("1")) {
                leggTilOkt();
            } else if (valg.equals("2")) {
                visDiagram();
            } else if (valg.equals("3")) {
                visProgresjon();
            } else if (valg.equals("4")) {
                visBaklengs();
            } else if (valg.equalsIgnoreCase("q")) {
                System.out.println("\nHa en god økt!");
                kjorer = false; //Betingelsen blir false ingen av alternativene er valgt og løkken avslutter
            } else {
                System.out.println("Ukent valg: " + valg);
            }
        }
        
        scanner.close();
            
                
                    
                
            
        
    }
}
