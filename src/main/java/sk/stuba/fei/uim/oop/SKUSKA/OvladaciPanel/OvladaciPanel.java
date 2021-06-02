package sk.stuba.fei.uim.oop.SKUSKA.OvladaciPanel;

import sk.stuba.fei.uim.oop.SKUSKA.Kreslenie.MyCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OvladaciPanel extends JPanel implements ItemListener {
    private MyCanvas can;
    private JButton usecka;
    private JButton plus;
    private Choice farba;
    private JLabel label;



    public OvladaciPanel(MyCanvas canvas){
        super();
        setLayout(new GridLayout(1,0));
        setFocusable(true);
        can = canvas;

        plus = new PlusButton("plus", can);
        usecka = new UseckaButton("usecka", can);
        farba = new Choice();
        farba.add("BLUE");
        farba.add("GREEN");
        farba.add("RED");
        farba.addItemListener(this);
        label = new JLabel("text");


        add(plus);
        add(usecka);
        add(farba);
        add(label);

    }



    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == farba ){
            switch (farba.getSelectedItem()){
                case "BLUE":
                    label.setForeground(Color.BLUE);
                    label.setText("Testovací text");
                    can.setC(Color.BLUE);
                    break;
                case "GREEN":
                    label.setForeground(Color.GREEN);
                    label.setText("Testovací text");
                    can.setC(Color.GREEN);
                    break;
                case "RED":
                    label.setForeground(Color.RED);
                    label.setText("Testovací text");
                    can.setC(Color.RED);
                    break;
                default:
                    break;
            }

        }

    }
}
