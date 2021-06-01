package sk.stuba.fei.uim.oop.Prednaska10_Stvorce_Kalk;

import sk.stuba.fei.uim.oop.Prednaska7_MouseListenery.TestCanvas;

import javax.swing.*;

public class MyFrameP10 extends JFrame {

    public MyFrameP10(){
        setSize(400,400);
        TestCanvasP10 can = new TestCanvasP10();
        add(can);

        setVisible(true);


    }
}
