public class sjakk {
    public static void main(String[] args) {
        
        final String SVART = " X ";
        final String HVIT = " _ ";
        final int ANTALL_RUTER = 8;
        IO.print("_");
    
        for (int j = 1; j <= ANTALL_RUTER; j++) {
             IO.print("|");
             
            for (int i = 1; i <= ANTALL_RUTER; i++) {
                if ((i + j) % 2 == 0) {
                    IO.print(HVIT);
                } else {
                    IO.print(SVART);
                }
            }
            IO.println("|");

        }
    }
}
