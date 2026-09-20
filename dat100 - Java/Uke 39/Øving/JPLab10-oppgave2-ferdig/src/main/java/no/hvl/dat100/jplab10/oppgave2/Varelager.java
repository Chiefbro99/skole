package no.hvl.dat100.jplab10.oppgave2;

public class Varelager {
    protected Vare[] varer;
    protected int antall;

    public Varelager(int n) {
        varer = new Vare[n];
        antall = 0;
    }

    public Vare[] getVarer() {
        return varer;
    }

    public boolean leggTilVare(Vare v) {
        if (antall >= varer.length || v == null) {
            return false;
        }
        varer[antall] = v;
        antall++;
        return true;
    }

    public boolean leggTil(int varenr, String navn, double pris) {
        return leggTilVare(new Vare(varenr, navn, pris));
    }

    public Vare finnVare(int varenr) {
        // Bare de antall første plassene inneholder varer.
        for (int i = 0; i < antall; i++) {
            if (varer[i].getVarenr() == varenr) {
                return varer[i];
            }
        }
        return null;
    }

    public void printVarelager() {
        System.out.println("==============================");
        for (int i = 0; i < antall; i++) {
            System.out.println(varer[i]);
        }
        System.out.println("==============================");
    }
}
