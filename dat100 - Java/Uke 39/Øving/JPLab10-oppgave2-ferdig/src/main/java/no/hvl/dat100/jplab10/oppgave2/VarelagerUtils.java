package no.hvl.dat100.jplab10.oppgave2;

public class VarelagerUtils {
    // Som i oppgaven: tabellen skal være fylt, uten null-plasser.
    public static Vare finnBilligste(Vare[] varer) {
        if (varer.length == 0) {
            return null;
        }
        Vare billigste = varer[0];
        for (Vare vare : varer) {
            if (vare.erBilligereEnn(billigste)) {
                billigste = vare;
            }
        }
        return billigste;
    }

    public static double totalPris(Vare[] varer) {
        double sum = 0;
        for (Vare vare : varer) {
            sum += vare.getPris();
        }
        return sum;
    }

    public static int[] finnVarenr(Vare[] varer) {
        int[] numre = new int[varer.length];
        for (int i = 0; i < varer.length; i++) {
            numre[i] = varer[i].getVarenr();
        }
        return numre;
    }

    public static double[] finnPrisDifferanser(Vare[] varer) {
        double[] differanser = new double[Math.max(0, varer.length - 1)];
        for (int i = 0; i < differanser.length; i++) {
            // Neste pris minus nåværende pris; resultatet kan være negativt.
            differanser[i] = varer[i + 1].getPris() - varer[i].getPris();
        }
        return differanser;
    }
}
