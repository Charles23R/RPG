/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public class Empoisonnement extends Sorts {

    int nbTour=0;
    public Empoisonnement(){
        cout=2;
        nom="Empoisonnement";
    }

    public void lancerSort(Personnage persoAttaque){
        persoAttaque.setPv(persoAttaque.getPv()-(2+(nbTour*2)));
        nbTour++;
    }
}
