package ClothesEquipped;

import Skeleton.Skeleton;

public class SwimsuitEquipped implements ClothesEquipped {

    /**
     * Konstruktora SwimsuitEquipped-nek
     * @param 
     */
    public SwimsuitEquipped(){
    }

    /**Hm
     * @return igazzal ter vissza; jelentes: a jatekos visel buvarruhat
     */
    @Override
    public boolean isWaterproof() {
        return true;
    }
}
