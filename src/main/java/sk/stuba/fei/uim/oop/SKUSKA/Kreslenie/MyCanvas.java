package sk.stuba.fei.uim.oop.SKUSKA.Kreslenie;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.fei.uim.oop.Prednaska10_Stvorce_Kalk.Obdlznik;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

@Setter
@Getter
public class MyCanvas extends Canvas implements MouseListener, MouseMotionListener {
    private int width;
    private int height;
    private Color c;
    private boolean wannaDrawPlus;
    private boolean wannaDrawUsecka;
    private boolean zvolenaFarba;
    private int xpos = 0;
    private int ypos = 0;

    private ArrayList<PlusKreslenie> ourPlusy = new ArrayList<PlusKreslenie>();
    private ArrayList<UseckaKreslenie> ourUsecky = new ArrayList<UseckaKreslenie>();
    private PlusKreslenie actObjectPlus;
    private UseckaKreslenie actObjectUsecka;

    public MyCanvas(int w, int h){
        super();
        width = w;
        height = h;
        wannaDrawPlus = false;
        wannaDrawUsecka = false;
        zvolenaFarba = false;

        addMouseMotionListener(this);
        addMouseListener(this);

        setSize(width, height);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        xpos = e.getX();
        ypos = e.getY();
        if (wannaDrawPlus && zvolenaFarba) {
            actObjectPlus = new PlusKreslenie(xpos,ypos,10,10, c);
        }
        else if (wannaDrawUsecka && zvolenaFarba) {
            actObjectUsecka = new UseckaKreslenie(xpos, ypos, xpos+100, ypos+100, c);
        }

    }
    @Override
    public void mouseDragged(MouseEvent e) {        // rozdelit zase IFom na usecku/plus
        int dx = e.getX();
        int dy = e.getY();
        if (actObjectUsecka != null){
            actObjectUsecka.setX2(dx);
            actObjectUsecka.setY2(dy);
            repaint();
        }

        if(actObjectPlus != null){
            if (dx > xpos && dy > ypos){
                actObjectPlus.setWidth(dx - xpos);
                actObjectPlus.setHeight(dy - ypos);
                repaint();
            }
            if (dx < xpos && dy > ypos){
                actObjectPlus.setXpos(dx);                 // meni sa X pozicia rohu
                actObjectPlus.setWidth(xpos-dx);
                actObjectPlus.setHeight(dy - ypos);
                repaint();
            }
            if (dx > xpos && dy < ypos){
                actObjectPlus.setYpos(dy);
                actObjectPlus.setWidth(dx-xpos);
                actObjectPlus.setHeight(ypos-dy);
                repaint();
            }
            if (dx < xpos && dy < ypos){
                actObjectPlus.setXpos(dx);
                actObjectPlus.setYpos(dy);
                actObjectPlus.setWidth(xpos-dx);
                actObjectPlus.setHeight(ypos-dy);
                repaint();
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(actObjectUsecka != null) {
            ourUsecky.add(actObjectUsecka);
            repaint();
            actObjectUsecka = null;
        }

        if(actObjectPlus != null) {
            ourPlusy.add(actObjectPlus);
            repaint();
            actObjectPlus = null;
        }
    }

    public void paint(Graphics g){
        for (UseckaKreslenie usecka : ourUsecky){
            usecka.paintTvar(g);
        }
        for (PlusKreslenie plus : ourPlusy){
            plus.paintTvar(g);
        }
        if (actObjectPlus != null){   // ešte ho len taham po ploche, neni v zozname
            actObjectPlus.paintTvar(g);
        }
        if (actObjectUsecka != null){   // ešte ho len taham po ploche, neni v zozname
            actObjectUsecka.paintTvar(g);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}


