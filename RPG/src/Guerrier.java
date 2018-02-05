/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class Guerrier extends Personnage {

    protected int pointForce;

    public void attaque(Personnage persoAttaque){

        persoAttaque.setPv(persoAttaque.getPv()-(pointForce*2-persoAttaque.getPointDef()));

    }

}
