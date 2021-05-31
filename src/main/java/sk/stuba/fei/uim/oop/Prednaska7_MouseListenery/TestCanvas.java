package sk.stuba.fei.uim.oop.Prednaska7_MouseListenery;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;

public class TestCanvas extends Canvas implements MouseMotionListener, MouseListener {
    private RectangleButton gombik;
    public HashSet<Rectangle> ourObjects = new HashSet<Rectangle>();


    public void paint(Graphics g){
        for (Rectangle r : ourObjects){
            g.drawRect(r.x, r.y, r.width, r.height);
        }
    }

    public TestCanvas(RectangleButton gombik){
        addMouseListener(this);
        addMouseMotionListener(this);
        this.gombik = gombik;

    }

    // MouseListener metody
    @Override
    public void mouseClicked(MouseEvent e) {
        if (gombik.isWannaRect()){
            ourObjects.add(new Rectangle(e.getX(), e.getY(),20,20));
            repaint();                                                              // prekreslenie
            gombik.setWannaRect(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {  }

    @Override
    public void mouseReleased(MouseEvent e) {  }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) {  }



    //MouseMotionListener metody
    @Override
    public void mouseDragged(MouseEvent e) {  //stlačena mys
  //      System.out.println("stlacena a hybem sa " + e.getX() + " "+ e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) { //pohyb mysou
  //      System.out.println("hybem sa " + e.getX() + " "+ e.getY());
    }
}
