/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class guerrier extends personnage {

    protected int pointForce;

    public void attaque(personnage persoAttaque){

        persoAttaque.setPv(persoAttaque.getPv()-(pointForce*2-persoAttaque.getPointDef()));

    }

}
