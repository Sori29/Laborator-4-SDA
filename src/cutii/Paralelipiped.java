package cutii;

public class Paralelipiped implements iCutie{
    private double lung,lat,inalt;

    public double getLung() {
        return lung;
    }

    public void setLung(float lung) {
        this.lung = lung;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public double getInalt() {
        return inalt;
    }

    public void setInalt(float inalt) {
        this.inalt = inalt;
    }

    public Paralelipiped(double lat, double lung, double inalt) {
        this.lung = lung;
        this.lat = lat;
        this.inalt = inalt;
    }

    @Override
    public double getSuprafataTotala() {
        return 2*(getLung()*getInalt()+getLung()*getLat()+getLat()*getInalt());
    }

    @Override
    public double getLungimePanglica() {
        return 2*(getLung()+getInalt())+2*(getLat()+getLung())+lnod;
    }

    @Override
    public String toString() {
        return "Cutie - Paralelipiped{l="+getLat()+", L= "+getLung()+", h="+getInalt()+"}";
    }
}
