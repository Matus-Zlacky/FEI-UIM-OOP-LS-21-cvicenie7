package sk.stuba.fei.uim.oop.SKUSKA.Kreslenie;

import java.awt.*;

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
      //  g.drawRect();         //zvisly
      //  g.drawRect();         //vodorovny

    }
}
