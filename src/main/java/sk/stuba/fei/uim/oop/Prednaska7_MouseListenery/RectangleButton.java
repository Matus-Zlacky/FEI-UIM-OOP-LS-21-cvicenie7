package sk.stuba.fei.uim.oop.Prednaska7_MouseListenery;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
@Setter
public class RectangleButton extends JButton implements ActionListener {
    private boolean wannaRect;

    public RectangleButton(String label){
        super(label);
        addActionListener(this);
        wannaRect = false;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I wanna a rect");
        wannaRect = true;
    }
}
