package sk.stuba.fei.uim.oop.Prednaska6_Buttony;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame implements ActionListener {
    private final String Close = "zavri";
    private final String Novinka = "new";
    public static int pocetFrameov = 0;         //nepouzivat na zadaniach a skuske !!
    public static int umiestnenie = 10;
 //   private JButton b;

    public TestFrame(String nazov){
        super(nazov);
        setSize(300,300);

        JPanel p = new JPanel();            //verzia 1
        JButton b = new JButton(Close);
        b.addActionListener(this);
        JButton novy = new JButton(Novinka);
        novy.addActionListener(this);

        p.add(b);
        p.add(novy);
        add(p);

        setLocation(umiestnenie, umiestnenie);
        setVisible(true);
        pocetFrameov++;
        umiestnenie+=50;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(Close)){
            if (pocetFrameov == 1){
                System.exit(0);
            }
            else{
                dispose();
                pocetFrameov--;
            }
        }
        if(e.getActionCommand().equals(Novinka)){
            new TestFrame("My app");
        }
/*
        if(e.getSource() == b){                     //verzia 2 zavretia s JButton ako private atribut
            dispose();
            System.exit(0);
        }*/
    }
}
