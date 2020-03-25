package Field;

import Coverable.Coverable;
import Player.*;
import Item.*;
import Skeleton.Skeleton;

import java.util.ArrayList;
import java.util.List;

public abstract class Field {
    private List<Player> players = new ArrayList<Player>();
    private List<Field> fields = new ArrayList<Field>();
    private Coverable cover = null;

    /**
     * Absztrakt fuggveny, a strategia setter-e.
     * @param c
     */
    public abstract void Gloo(Coverable c);

    /**
     * Uj jatekos erkezik a mezore. Ha meg elbirja a mezo, akkor a jatekos ezentul ezen a mezon áll.
     * Ha nem birja el, akkor a jatekos a vizbe esik.
     * @param p
     */
    public void Accept(Player p){
        Skeleton.Called("Accept");
        Skeleton.Return();
    }

    /**
     *A parameterkent kapott jatekos elhagyja a mezot.
     * @param p
     */
    public void Remove(Player p){
        Skeleton.Called("Remove");
        Skeleton.Return();
    }

    /**
     * Visszaad egy mar kiasott targyat és eltavolitja azt a mezobol.
     * @return
     */
    public Item RemoveItem(){
        Skeleton.Called("RemoveItem");
        Skeleton.Return();
        return null;
    }

    /**
     * Visszaadja a mezon tartozkodo jatekosokat.
     * @return
     */
    public List<Player> getPlayers() {
        Skeleton.Called("getPlayers");
        Skeleton.Return();
        return players;
    }

    /**
     * Megnoveli a mezon levo horetegek szamat.
     */
    public void IncrLayerOfSnow(){
        Skeleton.Called("IncrLayerOfSnow");
        Skeleton.Return();
    }

    /**
     * Csokkenti a mezon levo horetegek szamat.
     * @param n
     */
    public void DecrLayerOfSnow(int n){
        Skeleton.Called("DecrLayerOfSnow");
        Skeleton.Return();
    }

    /**
     * Visszaadja, hogy a mezo hany jatekost bir el.
     * @return
     */
    public int getCapacity(){
        Skeleton.Called("getCapacity");
        Skeleton.Return();
        return 0;
    }

    /**
     * Meghivja a strategiajanak az IsCovered() fuggvenyet,
     * vagyis megmondja, hogy fedett-e a mezo vagy sem.
     * @return
     */
    public boolean IsCovered(){
        Skeleton.Called("IsCovered");
        Skeleton.Return();
        return false;
    }
}
