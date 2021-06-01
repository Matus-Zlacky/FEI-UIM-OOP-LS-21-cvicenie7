package sk.stuba.fei.uim.oop.Prednaska8_KeyboardEventy;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Getter
@Setter
public class TestFrame_Menu extends JFrame implements ActionListener {
    private JRadioButtonMenuItem ignore;
    private PopupMenu pm;

    public TestFrame_Menu(){
        setSize(300,300);

        JMenuBar m = new JMenuBar();        //horna lista
        setJMenuBar(m);  // setne m ako MenuBar frameu

        JMenu test = new JMenu("zatvarac okna");    //menu - polozka na hornej liste
        m.add(test);

        JMenuItem item = new JMenuItem("close");      //item daneho menu
        item.addActionListener(this);
        test.add(item);

        ignore = new JRadioButtonMenuItem("do not close");
        test.add(ignore);
        ignore.setSelected(true);       //na zaciatku dame na true

        pm = new PopupMenu();       //PopupMenu
        MenuItem mi = new MenuItem("close");
        mi.addActionListener(this);
        pm.add(mi);
        add(pm);

        addMouseListener(new MouseAdapter() {           //doplnim iba mousePressed, ostatne netreba
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger() || e.isMetaDown() || e.getButton() == 3){
                    pm.show(e.getComponent(), e.getX(),e.getY());         //pravym tlacidlom mysi mi vyskoci close
                }
            }
        });

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("close") && !ignore.isSelected()){
            System.exit(0);
        }
    }
}
