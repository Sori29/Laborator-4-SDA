package jucarii;

import cutii.TipCutie;

public class Racheta extends Jucarie{
    public Racheta(double l1, double l2, double l3) {
        super(l1, l2, l3);
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.CILINDRU;
    }

    @Override
    public double getPret() {
        return 120;
    }

    @Override
    public String toString() {
        double[] v=getDimensiuni();
        return "{Racheta, cutie recomandata:"+getTipCutie()+", l1="+v[0]+", l2="+v[1]+"}";
    }
}
