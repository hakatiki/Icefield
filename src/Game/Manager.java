package Game;

import Item.Item;
import Player.Player;
import Skeleton.Skeleton;

import java.util.*;

public final class Manager {
    private static Game game = Game.getInstance();

    /**
     * a jatekban szereplo jatekosok
     */
    private List<Player> players = new ArrayList<>();

    /**
     * az idojaras melynek felelossege a vihar lebonyolitasa
     */
    private static Weather weather = Weather.getInstance();
    private static Manager INSTANCE;


    public static Manager getInstance(){
        if(INSTANCE == null)
            INSTANCE = new Manager();

        return INSTANCE;
    }

    /**
     * Letiltjuk ennnek a hasznalatat nehogy valaki a skeletonban ezzel hozzon letre managert
     * mivel a helyes hasznalat a getInstance fuggveny meghivasa
     */
    private Manager(){}

    /**
     *
     * @param i a targy amit a jatekos atad a managernek a jatek megnyeresehez
     */
    public static void addItem(Item i){
        Skeleton.Called(getInstance(),"addItem");

        if(Skeleton.Question("<<Minden játékos ezen a jégtáblán tartózkodik?(Igen/Nem)>>")){
            if(Skeleton.Question("<<Ez az utolsó hiányzó tárgy?(Igen/Nem)>>")){
                Game game = Game.getInstance();
                game.Win();
            }
        }else{
            Player holder = i.getHolder();

            holder.AcceptItem(i);
        }

        Skeleton.Return();
    }

    /**
     * elinditja a jatekosok lepeseit
     */
    public static void Start(){
        Skeleton.Called(getInstance(),"Start");
        Skeleton.Return();
    }

    /**
     * jatekos halalanal hivodik
     */
    public static void Lose(){
        Skeleton.Called(getInstance(),"Lose");
        game.Lose();

        Skeleton.Return();
    }
}
