package Game;

import Field.*;
import Skeleton.Skeleton;

import java.util.ArrayList;
import java.util.List;


public final class Weather {
    private List<Field> fields = new ArrayList<Field>();

    public void Blizzard() {
        Skeleton.Called(this,"Blizzard()");


        Skeleton.Return();
    }
}
