package sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@Setter
@Getter
public class TestFrame_ItemListener extends JFrame implements ItemListener {
    //Choice and Zoznam
    private List zoznam;
    private Choice rozbalovacieVolby;
    private String[] polozkyPreZoznam = {"jablko", "hruska", "ceresna", "melon", "ananas"};
    private String[] polozkyPreRozbalocieVolby = {"jablko", "hruska", "ceresna", "melon", "ananas"};

    //RadioButtony
    private JRadioButton one;       //iba 1 z ButtonGroup moze byt true !!
    private JRadioButton two;
    private ButtonGroup bg;

    //CheckBoxy
    private JCheckBox oneCh;        // mozu byt oba false/true !!
    private JCheckBox twoCh;
    private JTextField in;

    public TestFrame_ItemListener(){
        super("Test");
        setSize(300,300);
        setLayout(new BorderLayout());

        //Choice and Zoznam
        rozbalovacieVolby = new Choice();
        rozbalovacieVolby.addItemListener(this);

        zoznam = new List();
        zoznam.addItemListener(this);

        for (int i = 0; i < polozkyPreZoznam.length; i++){
            zoznam.add(polozkyPreZoznam[i]);
        }

        for (int i = 0; i < polozkyPreRozbalocieVolby.length; i++){
            rozbalovacieVolby.add(polozkyPreRozbalocieVolby[i]);
        }

        add("Center", zoznam);
        add("South", rozbalovacieVolby);


        setVisible(true);

        ///////////RadioButton///////////////
        /*bg = new ButtonGroup();

        one = new JRadioButton("one");
        one.addItemListener(this);
        add("North", one);
        bg.add(one);

        two = new JRadioButton("two", true);        //nastavime druhy na true
        two.addItemListener(this);
        add("Center", two);
        bg.add(two);

        in = new JTextField();
        add("South", in);
        in.setText("One is " + one.isSelected() + " and two is " + two.isSelected());    //vypis stavov danym checkBoxov
*/

        /////////////CheckBoxy///////////////
          /*   oneCh = new JCheckBox("one", true);
        oneCh.addItemListener(this);
        add("North", one);

        twoCh = new JCheckBox("two", false);
        twoCh.addItemListener(this);
        add("Center", two);
*/
    }


    //ItemListener metoda
    @Override
    public void itemStateChanged(ItemEvent e) {
        //Choice and Zoznam
        if (e.getSource() == rozbalovacieVolby){
            zoznam.select(rozbalovacieVolby.getSelectedIndex());
        }
        else if(e.getSource() == zoznam){
            rozbalovacieVolby.select(zoznam.getSelectedIndex());
        }


        //RadioButtony
     /*   if (e.getSource() == one){
            in.setText("one was changed and is " + one.isSelected() + " and two is " + two.isSelected());
        }
        else if(e.getSource() == two){
            in.setText("two was changed and is " + two.isSelected() + " and one is " + one.isSelected());
        }*/


        //CheckBoxy
        /* if (e.getSource() == oneCh){
            in.setText("one was changed and is " + oneCh.isSelected() + " and two is " + twoCh.isSelected());
        }
        else if(e.getSource() == twoCh){
            in.setText("two was changed and is " + twoCh.isSelected() + " and one is " + oneCh.isSelected());
        }*/
    }
}
