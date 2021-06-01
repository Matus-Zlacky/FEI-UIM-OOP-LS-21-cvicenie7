package sk.stuba.fei.uim.oop.Prednaska10_Cursory_Fonty;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame_CloseQ_JD extends JFrame {
    final JFrame f;
    public TestFrame_CloseQ_JD(){
        f = this;                       // treba kvoli posielaniu parametra do CloseQuestion_JDialog - this nefunguje !!
        setSize(400,400);
        setVisible(true);

        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);    // inak exitne aj ked dam NO !!
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CloseQuestion_JDialog end = new CloseQuestion_JDialog(f);
                    if (end.isYes()){
                        dispose();
                        System.exit(0);
                    }
            }
        });

    }


}
