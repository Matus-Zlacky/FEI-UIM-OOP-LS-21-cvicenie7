package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.Prednaska7_MouseListenery.MyFrameP7;
import sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy.MyCanvas_ScrollTest;
import sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy.TestCanvas_KeyListener;
import sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy.TestFrame_ItemListener;
import sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy.TestFrame_Menu;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //PREDNASKA 8
        new TestFrame_Menu();

        /*  JFrame f = new JFrame();
        ScrollPane ms = new ScrollPane();               //scroll bar na pohyb po mensom Frame ako Canvase
        MyCanvas_ScrollTest papier = new MyCanvas_ScrollTest();
        papier.setSize(500,500);
        ms.add(papier);
        f.add(ms);

        f.setSize(300,300);
        f.setVisible(true);*/


        //new TestFrame_ItemListener();


        //PREDNASKA 7
       // new MyFrameP7("stvorce");

        //PREDNASKA 6
        /*
        new TestFrame("My app");

        JFrame f = new JFrame();
        f.setSize(300,300);

        JPanel p = new JPanel();            //verzia 1
        MyButton b = new MyButton("OK");
        p.add(b);
        f.add(p);

        JPanel p = new JPanel();            //verzia 2
        JButton b = new JButton("OK");
        b.addActionListener(new ButtonPrinter());       //button printer je listener pre b button
        p.add(b);
        f.add(p);

        f.setVisible(true); */
       // JFrameP6 f = new JFrameP6();

    }



}
