package Item;

import Field.Field;
import Player.*;
import Skeleton.Skeleton;

public class Spade extends Item {
    /**
     * @param p a player akin az item hasznalva lesz (megegyezhet a haszan,lojaval is)
     */
    @Override
    public void Use(Player p) {
        Field field = p.getField();
        field.DecrLayerOfSnow(2);
    }
}
