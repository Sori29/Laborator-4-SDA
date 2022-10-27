package magazin;
import cutii.Cilindru;
import cutii.Cub;
import cutii.Paralelipiped;
import jucarii.Jucarie;
import cutii.iCutie;

public class FabricaCutii {
    public iCutie getCutie(Jucarie jucarie){
        String a= String.valueOf(jucarie.getTipCutie());
        double[] v= jucarie.getDimensiuni();
        if(a=="PARALELIPIPED"){
            Paralelipiped paralelipiped=new Paralelipiped(v[0],v[1],v[2]);
            return paralelipiped;
        }
        else if(a=="CUB"){
            Cub cub=new Cub(v[0]);
            return cub;
        }
        else{
            Cilindru cilindru=new Cilindru(v[0],v[1]);
            return cilindru;
        }
    }
}
