package no.hvl.dat100.jplab10.oppgave2;

import java.util.Arrays;

public class Hovedprogram {
    public static void main(String[] args) {
        Varelager lager = new Varelager(3);
        lager.leggTil(101, "Blyant", 10.0);
        lager.leggTil(102, "Notatbok", 35.0);
        lager.leggTil(103, "Viskelær", 15.0);

        System.out.println("MITT VARELAGER");
        lager.printVarelager();
        System.out.println("Fant vare 102: " + lager.finnVare(102));
        System.out.println("Ukjent vare 999: " + lager.finnVare(999));
        System.out.println("Plass til en vare til? " + lager.leggTil(104, "Penn", 20.0));

        // Alle tre plassene er fylt, slik Utils-metodene forutsetter.
        Vare[] varer = lager.getVarer();
        System.out.println("Billigste: " + VarelagerUtils.finnBilligste(varer));
        System.out.println("Total pris: " + VarelagerUtils.totalPris(varer));
        System.out.println("Varenumre: " + Arrays.toString(VarelagerUtils.finnVarenr(varer)));
        System.out.println("Prisforskjeller: " + Arrays.toString(VarelagerUtils.finnPrisDifferanser(varer)));
    }
}
