package magazin;
import cutii.*;
import jucarii.*;
import java.util.*;

public class Magazin {
    private ArrayList<Pachet> listaVanzari;
    public void afisVanzari(){
        double sum_totala=0;
        for(int i=0;i< listaVanzari.size();i++){
            System.out.println(i+1+". "+ listaVanzari.get(i));
            System.out.println("Pret="+listaVanzari.get(i).pretPachet());
            sum_totala+=listaVanzari.get(i).pretPachet();
        }
        System.out.println("\nSuma totala incasata="+sum_totala);
    }

    public ArrayList<Pachet> getListaVanzari() {
        return listaVanzari;
    }

    public Magazin(ArrayList<Pachet> listaVanzari) {
        this.listaVanzari = listaVanzari;
    }

    public Magazin() {
        listaVanzari = new ArrayList<>(15);
    }

    public void afisPacheteDupaPreț( boolean descrescator){
            if(descrescator == false)
                listaVanzari.sort(((o1, o2) -> o1.compareTo(o2)));
            else listaVanzari.sort(((o1, o2) -> o2.compareTo(o1)));
            for(Pachet pachete : listaVanzari){
                System.out.println(pachete+"\npret="+pachete.pretPachet());
            }

    }
    public static void main(String[] args){

    System.out.println("\n===== Demo Cutii (2p) =====");
    Paralelipiped paralelipiped = new Paralelipiped(10.0,20.0,30.0);
    Cub cub = new Cub(40.0);
    Cilindru cilindru = new Cilindru(50.0,60.0);

    System.out.println("["+paralelipiped+","+cub+","+cilindru+"]");

    System.out.println("\n===== Demo Jucarii (2p) =====");
    Avion avion=new Avion(15.0,25.0,35.0);
    Minge minge=new Minge(45.0,0,0);
    Racheta racheta=new Racheta(55.0,65.0,0);
    Jucarie[] jucarii=new Jucarie[]{avion,minge,racheta};
    System.out.print("[");
    for(int i=0;i<jucarii.length-1;i++){
        System.out.print(jucarii[i]+",");
    }
    System.out.print(jucarii[jucarii.length-1]+"]\n");
    System.out.println("\n===== Demo Frabrica de cutii (1p) =====");
    FabricaCutii fabricaCutii = new FabricaCutii();
        for (Jucarie jucarie : jucarii) {
            System.out.println("Pentru jucaria:" + jucarie);
            System.out.println("\tcutia:" + fabricaCutii.getCutie(jucarie));
        }
    System.out.println("\n===== Demo Panglica (1p) =====");
    RolaPanglica.getRola().setLungime_panglica(10000);
    System.out.println("Pentru cutia:"+paralelipiped+" necesar lung_panglica="+paralelipiped.getLungimePanglica());
    RolaPanglica.getRola().setLungime_panglica(RolaPanglica.getRola().getDisponibil()-paralelipiped.getLungimePanglica());
    System.out.println(RolaPanglica.getRola());
    System.out.println("Pentru cutia:"+cub+" necesar lung_panglica="+cub.getLungimePanglica());
    RolaPanglica.getRola().setLungime_panglica(RolaPanglica.getRola().getDisponibil()-cub.getLungimePanglica());
    System.out.println(RolaPanglica.getRola());
    System.out.println("Pentru cutia:"+cilindru+" necesar lung_panglica="+cilindru.getLungimePanglica());
    RolaPanglica.getRola().setLungime_panglica(RolaPanglica.getRola().getDisponibil()-cilindru.getLungimePanglica());
    System.out.println(RolaPanglica.getRola());

    System.out.println("\n===== Demo Pachet (1p) =====");
    Pachet p1 = new Pachet(new Minge(10,0,0), true, true);
    System.out.println(p1);
    System.out.println("Pret="+p1.pretPachet());

        System.out.println("\n===== Demo Magazin (2p) =====");
        Magazin m = new Magazin();
        ArrayList<Pachet> vanzari = m.getListaVanzari();
        vanzari.add( new Pachet(new Minge(10,0,0), true, true) );
        vanzari.add( new Pachet(new Minge(10,0,0), true, false) );
        vanzari.add( new Pachet(new Minge(10,0,0), true, true) );
        vanzari.add( new Pachet(new Minge(10,0,0), false, false) );
        vanzari.add( new Pachet(new Racheta(10,20,0), false, false) );
        vanzari.add( new Pachet(new Avion(10,20, 30), false, false) );
        vanzari.add( new Pachet(new Avion(10,20, 30), true, false) );
        m.afisVanzari();
        System.out.println("In rola au mai ramas "+
                RolaPanglica.getRola().getDisponibil()+" cm");
        Magazin magazin = new Magazin(vanzari);

        System.out.println("\n===== Demo Sortare pachete  =====");
        magazin.afisPacheteDupaPreț(true);
}
}
