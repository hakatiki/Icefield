package Field;

import Coverable.*;
import Game.Entity;
import Item.*;
import Player.Player;
import Skeleton.Skeleton;

import java.util.ArrayList;
import java.util.List;

/**
 * A mezo egy tipusa. A jegtablat reprezentalja a jatekban.
 * Az eszkimok tudnak ra iglut epiteni és lehetnek targyak belefagyva, melyeket a jatekosok ki tudnak belole asni.
 */
public class IceBlock extends Field {
    /** A mezon talalhato item **/
    protected Item item = null;

    @Override
    public void setItem(Item _item) {
        if (item != null)
            item = _item;
    }

    @Override
    public void Accept(Entity e) {
        getEntites().add(e);
        e.setField(this);
        for (Entity i: entities) {
            i.Meet(e);
        }
        if(getEntites().size()>getCapacity()){
            for (Entity i: getEntites()) {
                i.setInWater(true);
            }
            Coverable nogloo = new NoCover();
            Cover(nogloo);
        }
    }

    /**
     * Visszaad egy mar kiasott targyat es eltavolitja azt a mezobol.
     * @return
     */
    @Override
    public Item RemoveItem(){
        Item i = item;
        item = null;
        return i;
    }

    /**
     *  Beallitja az fedettseg strategiat.
     * @param c
     */
    public void Cover(Coverable c){
        cover = c;
    }

}
