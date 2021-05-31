package sk.stuba.fei.uim.oop.Prednaska7_MouseListenery;

import javax.swing.*;

public class MyFrameP7 extends JFrame {

    public MyFrameP7(String nazov){
        super(nazov);
        setSize(300,300);
        JPanel p = new JPanel();
        RectangleButton gombik = new RectangleButton("stvorec");
        p.add(gombik);
        add("North", p);
        TestCanvas can = new TestCanvas(gombik);
        add("Center", can);

        addWindowListener(new CloseWindow());           // ukoncenie stlacenim X vpravo hore na Frame

        setVisible(true);


    }
}
