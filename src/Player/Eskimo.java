package Player;

import Coverable.IglooCover;
import Field.*;

/**
 * Egy jatekos altal iranyitott karaktert reprezental, aki iglu epitesere kepes, annak
 * erdekeben, hogy a jatekosok at tudjak veszelni a hovihart.
 */
public class Eskimo extends Player {

    public Eskimo(Field _field) {
        super(5, 4, 5, _field);
    }

    /**
     * @param f A mező amire a kepesseget hasznalja majd a player (Oda epit Iglut vagy deriti fel)
     * @return visszater nullaval
     */
    @Override
    public int UseAbility(Field f){
        getField().Cover(new IglooCover());
        return -1;
    }

}
