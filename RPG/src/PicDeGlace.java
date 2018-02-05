/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class PicDeGlace extends Sorts {

    public PicDeGlace(){
        cout=5;
        nom="Pic de glace";
    }

    public void lancerSort(Personnage persoAttaque){
        persoAttaque.setPv(persoAttaque.getPv()-(7-persoAttaque.getPointDef()));
    }
}
