public class whileb {
    public static void main(String[] args) {
        int x = 16;
        int y = 12;
        
        while (x != y) {
            
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
          // Skriver ut resultatet (siden løkken stopper når x == y, er x eller y svaret)
        System.out.println("Største felles divisor er: " + x);
    }
}
