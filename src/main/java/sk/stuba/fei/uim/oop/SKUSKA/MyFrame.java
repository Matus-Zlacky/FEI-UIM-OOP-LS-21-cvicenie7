package sk.stuba.fei.uim.oop.SKUSKA;

import sk.stuba.fei.uim.oop.SKUSKA.Kreslenie.MyCanvas;
import sk.stuba.fei.uim.oop.SKUSKA.OvladaciPanel.OvladaciPanel;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private int width;
    private int height;


    public MyFrame(){
        super();
        width = 500;
        height = 500;
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // zatvori sa na stlačenie X
        setLayout(new BorderLayout());

        MyCanvas can = new MyCanvas(width-5,height-50);
        add(can);

        OvladaciPanel ovladaciPanel = new OvladaciPanel(can);
        add("North", ovladaciPanel);


        setFocusable(true);
        setVisible(true);

    }
}
