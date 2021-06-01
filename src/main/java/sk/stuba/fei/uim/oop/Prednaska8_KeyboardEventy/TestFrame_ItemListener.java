package sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestFrame_ItemListener extends JFrame implements ItemListener {
    private JCheckBox one;
    private JCheckBox two;

    public TestFrame_ItemListener(){
        setSize(300,300);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
