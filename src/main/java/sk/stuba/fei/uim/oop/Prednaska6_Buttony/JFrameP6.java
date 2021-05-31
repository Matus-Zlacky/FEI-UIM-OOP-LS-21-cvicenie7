package sk.stuba.fei.uim.oop.Prednaska6_Buttony;

import javax.swing.*;
import java.awt.*;

public class JFrameP6 extends JFrame {
    public JFrameP6() {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setLayout(new GridLayout(0, 2));       // tolko riadkov kolko treba ale 2 stlpce

        /*f.setLayout(new BorderLayout());      //border layout
        f.add("Center", new Label("cislo 1"));
        f.add("South", new Label("cislo 2"));
        */

        f.add(new JLabel("cislo 1"));
        f.add(new JLabel("cislo 2"));
        f.add(new JLabel("cislo 3"));
        f.add(new JLabel("cislo 4"));
        f.add(new JLabel("cislo 5"));
        f.pack();   // da do najmensieho "pekneho tvaru"
        f.setVisible(true);
    }
}
