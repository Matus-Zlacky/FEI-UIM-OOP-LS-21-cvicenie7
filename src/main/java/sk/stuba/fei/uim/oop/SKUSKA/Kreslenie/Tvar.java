package sk.stuba.fei.uim.oop.SKUSKA.Kreslenie;

import java.awt.*;

public abstract class Tvar {
    private Color c;
    private int xpos;
    private int ypos;

    public Tvar(){}
    public abstract void paintTvar(Graphics g);

}
