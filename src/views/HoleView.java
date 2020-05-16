package views;

import Field.Hole;

import java.awt.*;
import java.awt.image.BufferedImage;


public class HoleView implements IView{
    Hole hole;
    BufferedImage image;
    HoleView(Hole h){hole = h;
        image = null;
        System.out.println("Még nincs betöltve");
    }
    @Override
    public void Draw(Graphics graphics) {
        graphics.drawImage(image,hole.X*64,hole.Y*64,null);
    }

    @Override
    public void RefreshData() {

    }
}
