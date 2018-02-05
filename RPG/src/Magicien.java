/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class Magicien extends Personnage {

    protected int pointMagie;
    protected Sorts tabSorts[]=new Sorts[2];


    public Magicien() {
        pointDef=1;
        pv=60;
    }

    public void attaque(Personnage persoAttaque) {

        Sorts sortChoisi;
        sortChoisi=tabSorts[(int)(Math.random()*2)+1];

        System.out.println("Le "+getNom()+" attaque!");
        System.out.println("Il utilise "+sortChoisi.getNom()+" ce qui lui coûte "+sortChoisi.getCout()+" points de magie");


        if (sortChoisi.getCout()>=pointMagie){

            sortChoisi.lancerSort(persoAttaque);
        }
    }

    public int getPointMagie() {
        return pointMagie;
    }
}
