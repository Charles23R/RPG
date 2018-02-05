/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class BouleDeFeu extends Sorts {

    public BouleDeFeu(){
        cout=5;
        nom="Boule de feu";
    }


    public void lancerSort(Personnage persoAttaque) {
        persoAttaque.setPv(persoAttaque.getPv()-5);
    }
}
