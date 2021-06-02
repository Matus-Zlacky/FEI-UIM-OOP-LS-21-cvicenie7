package sk.stuba.fei.uim.oop.SKUSKA.Kreslenie;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class UseckaKreslenie extends Tvar{
    private Color c;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public UseckaKreslenie(int xZac, int yZac, int xKon, int yKon, Color color){
        x1 = xZac;
        y1 = yZac;
        x2 = xKon;
        y2 = yKon;
        c = color;
    }



    @Override
    public void paintTvar(Graphics g) {
        g.setColor(c);
        g.drawLine(x1,y1,x2,y2);
    }
}
