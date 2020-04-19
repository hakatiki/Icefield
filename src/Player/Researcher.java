package Player;

import Field.Field;


public class Researcher extends Player {
    public Researcher(int _actualHealth, int _actualWorkUnit, int _maxHealth,Field _field) {
        super(_actualHealth, _actualWorkUnit, _maxHealth, _field);
    }

    /**
     * @param f A mező amire a kepesseget hasznalja majd a player (Oda epit Iglut vagy deriti fel)
     * @return visszater a mezo teherbiro kepessegevel
     */
    @Override
    public int UseAbility(Field f) {
        return f.getCapacity();
    }
}
