package sk.stuba.fei.uim.oop.Prednaska10_Stvorce_Kalk;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class TestCanvasP10 extends Canvas implements MouseListener, MouseMotionListener {
    private ArrayList<Obdlznik> ourObjects = new ArrayList<Obdlznik>();
    private Obdlznik actObdlznik;

    private int xpos = 0;
    private int ypos = 0;

    public TestCanvasP10(){
         super();
         addMouseListener(this);
         addMouseMotionListener(this);
    }


    @Override
    public void mousePressed(MouseEvent e) {
        xpos = e.getX();
        ypos = e.getY();
        actObdlznik = new Obdlznik(xpos, ypos,1,1,Color.blue);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        int dx = e.getX();
        int dy = e.getY();
        if (actObdlznik != null){
            if (dx > xpos && dy > ypos){
                actObdlznik.width = dx - xpos;
                actObdlznik.height = dy - ypos;
                repaint();
            }
            if (dx < xpos && dy > ypos){
                actObdlznik.x = dx;                 // meni sa X pozicia rohu
                actObdlznik.width = xpos - dx;
                actObdlznik.height = dy - ypos;
                repaint();
            }
            if (dx > xpos && dy < ypos){
                actObdlznik.y = dy;
                actObdlznik.width = dx - xpos;
                actObdlznik.height = ypos - dy;
                repaint();
            }
            if (dx < xpos && dy < ypos){
                actObdlznik.x = dx;
                actObdlznik.y = dy;
                actObdlznik.width = xpos - dx;
                actObdlznik.height = ypos - dy;
                repaint();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ourObjects.add(actObdlznik);
        repaint();
        actObdlznik = null;
    }

    public void paint(Graphics g){
        for (Obdlznik o : ourObjects){
            o.paintObldznik(g);
        }
        if (actObdlznik != null){   // ešte ho len taham po ploche, neni v zozname
            actObdlznik.paintObldznik(g);
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
