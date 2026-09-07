public class sirkel {
    public static void main(String[] args) {
        double areal = arealSirkel(10);
        IO.println(areal);
    }
    
    static double arealSirkel(double radius) {
        double areal = Math.PI * radius * radius;
        return areal;
    }
    

}
