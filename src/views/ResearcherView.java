package views;

import Player.Researcher;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ResearcherView implements IView {
    Researcher researcher;
    ResearcherView(Researcher r){researcher = r;}
    @Override
    public void Draw() {
        throw new NotImplementedException();
    }

    @Override
    public void RefreshData() {
        throw new NotImplementedException();
    }
}
