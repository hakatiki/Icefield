package views;

import Item.Rope;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RopeView implements IView {
    Rope rope;
    RopeView(Rope r){rope = r;}
    @Override
    public void Draw() {
        throw new NotImplementedException();
    }

    @Override
    public void RefreshData() {
        throw new NotImplementedException();
    }
}
