package sk.stuba.fei.uim.oop.Prednaska7_MouseListenery;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CloseWindow extends WindowAdapter{

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
