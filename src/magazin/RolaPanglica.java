package magazin;

public class RolaPanglica {
private static double lungime_panglica_init=10000;
private static double lungime_panglica;
    public void setLungime_panglica(double lungime_panglica) {
        this.lungime_panglica = lungime_panglica;
    }

    public RolaPanglica(double lungime_panglica) {
        this.lungime_panglica = lungime_panglica;
    }

    public RolaPanglica() {
        lungime_panglica=lungime_panglica_init;
    }

    @Override
    public String toString() {
        return "\tdupa cumparare: {RolaPanglica, disponibil="+getDisponibil()+"}";
    }
    public static RolaPanglica getRola(){
         return new RolaPanglica(lungime_panglica);
    }
    public double getDisponibil(){
        return lungime_panglica;
    }
}
