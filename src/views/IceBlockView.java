package views;

import Coverable.IglooCover;
import Coverable.TentCover;
import Field.Field;
import Field.IceBlock;
import Game.Manager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class IceBlockView implements IView {
    IceBlock iceBlock;

    BufferedImage image;

    BufferedImage imagewithsnow;
    BufferedImage imagewithoutsnow;
    BufferedImage tentcoverimage;
    BufferedImage igloocoverimage;
    public IceBlockView(IceBlock i){
        iceBlock = i;
        try {
            imagewithoutsnow =  ImageIO.read(new File("src/images/iceblock.png"));
            imagewithsnow = ImageIO.read(new File("src/images/snow.png"));
            tentcoverimage = ImageIO.read(new File("src/images/tentCover.png"));
            igloocoverimage = ImageIO.read(new File("src/images/igloo.png"));
        } catch (IOException e) {
            System.out.println("Baj van - IceBlockView betoltese");
        }
    }
    @Override
    public void Draw(Graphics graphics) {
        if(iceBlock.getLayerOfSnow()==0)
            graphics.drawImage(imagewithoutsnow,iceBlock.X*64,iceBlock.Y*64,null);
        else
            graphics.drawImage(imagewithsnow,iceBlock.X*64,iceBlock.Y*64,null);
        Field chosenField = GameplayFrame.getChosenField();
        if (chosenField != null && chosenField.equals(iceBlock)){
            Graphics2D g2D = (Graphics2D) graphics;
            g2D.setColor(Color.green);
            g2D.setStroke(new BasicStroke(4));
            g2D.drawRect(iceBlock.X*64,iceBlock.Y*64, 64,64);
        }
        if(iceBlock.isInspected){
            String string = iceBlock.getCapacity()==-1? "inf" : Integer.toString(iceBlock.getCapacity());
            graphics.drawString(string, iceBlock.X*64 +48,iceBlock.Y*64+2 );
        }
    }

    @Override
    public void RefreshData() {

    }
}
