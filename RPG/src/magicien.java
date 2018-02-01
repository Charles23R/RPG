/**
 * Created by RenCh1732786 on 2018-02-01.
 */
public abstract class magicien extends personnage {

    protected int pointMagie;
    protected sorts tabSorts[]=new sorts[2];

    public magicien() {
        pointDef=1;
        pv=60;
    }

    public void attaque() {
        
    }
}
