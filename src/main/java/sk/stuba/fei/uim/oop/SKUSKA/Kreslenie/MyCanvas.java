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
    private int xpos = 0;
    private int ypos = 0;

    private ArrayList<Tvar> ourObjects = new ArrayList<Tvar>();
    private Tvar actObject;

    public MyCanvas(int w, int h){
        super();
        width = w;
        height = h;
        wannaDrawPlus = false;
        wannaDrawUsecka = false;

        setSize(width, height);
        setFocusable(false);

        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xpos = e.getX();
        ypos = e.getY();
        if (wannaDrawPlus) {
            actObject = new PlusKreslenie(xpos,ypos,10,10, c);
        }
        else if (wannaDrawUsecka) {
            actObject = new UseckaKreslenie(xpos, ypos, xpos+10, ypos+10, c);
        }

    }
    @Override
    public void mouseDragged(MouseEvent e) {        // rozdelit zase IFom na usecku/plus
     /*   int dx = e.getX();
        int dy = e.getY();
        if (actObject != null){
            if (dx > xpos && dy > ypos){
                actObject.width = dx - xpos;
                actObject.height = dy - ypos;
                repaint();
            }
            if (dx < xpos && dy > ypos){
                actObject.x = dx;                 // meni sa X pozicia rohu
                actObject.width = xpos - dx;
                actObject.height = dy - ypos;
                repaint();
            }
            if (dx > xpos && dy < ypos){
                actObject.y = dy;
                actObject.width = dx - xpos;
                actObject.height = ypos - dy;
                repaint();
            }
            if (dx < xpos && dy < ypos){
                actObject.x = dx;
                actObject.y = dy;
                actObject.width = xpos - dx;
                actObject.height = ypos - dy;
                repaint();
            }
        }*/
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ourObjects.add(actObject);
        repaint();
        actObject = null;
    }

    public void paint(Graphics g){
        for (Tvar o : ourObjects){
            o.paintTvar(g);
        }
        if (actObject != null){   // ešte ho len taham po ploche, neni v zozname
            actObject.paintTvar(g);
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


