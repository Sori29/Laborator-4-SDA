package jucarii;

import cutii.TipCutie;

public class Minge extends Jucarie {

    public Minge(double l1, double l2, double l3) {
        super(l1, l2, l3);
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.CUB;
    }

    @Override
    public double getPret() {
        return 50;
    }

    @Override
    public String toString() {
        double[] v=getDimensiuni();
        return "{Minge, cutie recomandata:"+getTipCutie()+", l1="+v[0]+"}";
    }
}
