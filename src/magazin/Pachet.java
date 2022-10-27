package magazin;
import jucarii.*;
import cutii.*;
public class Pachet {
    private Jucarie jucarie;
    private iCutie cutie;
    private double lungPanglica;
    public Pachet(Jucarie jucarie,boolean cereCutie,boolean cerePanglica) {
        this.jucarie=jucarie;
        FabricaCutii fabricaCutii = new FabricaCutii();
        if(cereCutie==true & cerePanglica ==true){
            cutie = fabricaCutii.getCutie(jucarie);
            lungPanglica=cutie.getLungimePanglica();
            RolaPanglica.getRola().setLungime_panglica(RolaPanglica.getRola().getDisponibil()-lungPanglica);
        }
        else if(cerePanglica==false & cereCutie==false){
            lungPanglica=0;
            cutie = fabricaCutii.getCutie(new Minge(0,0,0));
        }
        else if(cerePanglica==true & cereCutie==false){
            lungPanglica=cutie.getLungimePanglica();
            RolaPanglica.getRola().setLungime_panglica(RolaPanglica.getRola().getDisponibil()-lungPanglica);
            cutie = fabricaCutii.getCutie(new Minge(0,0,0));
        }
        else{
            lungPanglica=0;
            cutie = fabricaCutii.getCutie(jucarie);
        }
    }
    public double pretPachet(){
        return jucarie.getPret()+cutie.pret()+(lungPanglica*0.01);
    }

    @Override
    public String toString() {
        if(cutie.pret()!=0 & lungPanglica!=0)
            return "Pachet{"+jucarie+", impachetat in "+cutie+", lungPanglica="+lungPanglica+"}";
        if(cutie.pret()==0)
            return "Pachet{"+jucarie+"}";
        if(cutie.pret()!=0 & lungPanglica==0)
            return "Pachet{"+jucarie+", impachetat in "+cutie+"}";
        return null;
    }

}
