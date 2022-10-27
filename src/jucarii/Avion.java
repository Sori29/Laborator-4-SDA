package jucarii;

import cutii.TipCutie;

public class Avion extends Jucarie{
    public Avion(double l1, double l2, double l3) {
        super(l1, l2, l3);
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.PARALELIPIPED;
    }

    @Override
    public double getPret() {
        return 100;
    }

    @Override
    public String toString() {
        double[] v=getDimensiuni();
        return "{Avion, cutie recomandata:"+getTipCutie()+", l1="+v[0]+", l2="+v[1]+", l3="+v[2]+"}";
    }
}
