/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class MortSubite extends Sorts {
    public MortSubite() {
        cout=10;
        nom="Mort subite";
    }

    public void lancerSort(Personnage persoAttaque){
        int random=(int)((Math.random()*10)+1);
        if (random==1){
            persoAttaque.setPv(0);
        }
    }
}
