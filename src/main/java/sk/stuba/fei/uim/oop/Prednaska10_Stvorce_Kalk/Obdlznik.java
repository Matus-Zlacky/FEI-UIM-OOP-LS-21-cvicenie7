package sk.stuba.fei.uim.oop.Prednaska10_Stvorce_Kalk;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class Obdlznik extends Rectangle {
    private Color color;

    public Obdlznik(int x, int y, int width, int height, Color c){
        super(x,y,width,height);
        color = c;
    }

    public void paintObldznik(Graphics g){
        g.setColor(color);
        g.drawRect(this.x, this.y, this.width, this.height);
    }

}
