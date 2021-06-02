package sk.stuba.fei.uim.oop.SKUSKA.OvladaciPanel;

import lombok.Getter;
import sk.stuba.fei.uim.oop.SKUSKA.Kreslenie.MyCanvas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
public class PlusButton extends JButton implements ActionListener {
    private final MyCanvas can;

    public PlusButton(String nazov, MyCanvas canvas){
        super(nazov);
        can = canvas;
        addActionListener(this);
        setFocusable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        can.setWannaDrawPlus(true);
        can.setWannaDrawUsecka(false);
    }
}
