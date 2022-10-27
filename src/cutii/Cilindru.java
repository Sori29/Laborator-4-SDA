package cutii;

public class Cilindru implements iCutie{
    private double r,h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Cilindru(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getSuprafataTotala() {
        return 2*Math.PI*r*(r+h);
    }

    @Override
    public double getLungimePanglica() {
        return Math.round(4*Math.PI*getR()+lnod);
    }

    @Override
    public String toString() {
        return "Cutie - Cilindru{r="+getR()+", h="+getH()+"}";
    }
}
