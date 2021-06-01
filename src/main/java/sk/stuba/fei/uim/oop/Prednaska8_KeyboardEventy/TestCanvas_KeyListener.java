package sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestCanvas_KeyListener extends Canvas implements KeyListener {

    public TestCanvas_KeyListener(){
        addKeyListener(this);
    }

    //KeyListener metody
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped zavolane - typed code je "+e.getKeyChar());        // Char lebo iba znak !
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.isActionKey()){
            System.out.println("keyPressed zavolane - action key je "+e.getKeyCode());      // Code lebo nemusi byt iba znak!
        }
        else{
            System.out.println("keyPressed zavolane - nieco ine je "+e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyRealeased zavolane - realeased code je "+e.getKeyCode());
        System.out.println("------------------");
    }
}
