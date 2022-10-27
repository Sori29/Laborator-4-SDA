package cutii;

public class Cub implements iCutie{
    private double l;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public Cub(double l) {
        this.l = l;
    }

    @Override
    public double getSuprafataTotala() {
        return 6*l*l;
    }

    @Override
    public double getLungimePanglica() {
        return 8*getL()+lnod;
    }

    @Override
    public String toString() {
        return "Cutie - Cub{l="+getL()+"}";
    }
}
