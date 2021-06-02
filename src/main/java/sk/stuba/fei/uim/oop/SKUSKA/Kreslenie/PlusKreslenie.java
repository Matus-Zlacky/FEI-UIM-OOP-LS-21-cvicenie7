package sk.stuba.fei.uim.oop.SKUSKA.Kreslenie;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class PlusKreslenie extends Tvar{
    private Color c;
    private int xpos;
    private int ypos;
    private int width;
    private int height;


    public PlusKreslenie(int x,int y, int w, int h, Color color){
        xpos = x;
        ypos = y;
        width = w;
        height = h;
        c = color;
    }


    @Override
    public void paintTvar(Graphics g) {
        g.setColor(c);
        g.drawRect(xpos+width/3,ypos,width/3,height);         //zvisly
        g.fillRect(xpos+width/3,ypos,width/3,height);

        g.drawRect(xpos,ypos+height/3,width,height/3);         //vodorovny
        g.fillRect(xpos,ypos+height/3,width,height/3);

    }
}
