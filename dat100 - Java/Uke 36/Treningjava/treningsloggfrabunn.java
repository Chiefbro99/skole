public class treningsloggfrabunn {
    public static void main(String[] args) {
        Okt a = new Okt("Knebøy", 80, 25);
        System.out.println(a.volum());
    }
}

class Okt {
    private final String ovelse;
    private final double vekt;
    private final int reps;

    public Okt(String ovelse, double vekt, int reps) {
        this.ovelse = ovelse;
        this.vekt = vekt;
        this.reps = reps;
    }

    public double volum() {
        return vekt * reps;
    }
}