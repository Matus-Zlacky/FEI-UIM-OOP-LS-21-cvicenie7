package sk.stuba.fei.uim.oop.Prednaska10_Cursory_Fonty;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
public class CloseQuestion_JDialog extends JDialog implements ActionListener {
    private boolean yes = false;

    public CloseQuestion_JDialog(JFrame f){
        super(f, "Close", true);
        add("North", new Label("Really close?"));

        JPanel p = new JPanel();
        JButton b = new JButton("Yes");
        p.add(b);
        b.addActionListener(this);

        JButton c = new JButton("No");
        p.add(c);
        c.addActionListener(this);

        add("South", p);

        pack();
        setLocation(f.getLocation().x+100,f.getLocation().y+100);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Yes")){
            yes = true;
        }
        dispose();
    }
}
