package sk.stuba.fei.uim.oop.Prednaska10_Cursory_Fonty;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Setter
@Getter
public class TestFrame_Cursor extends JFrame implements ActionListener {
    private Panel buttonPanel;
    private Button crosshairC;
    private Button waitC;
    private Button defaultC;
    private Button textC;
    private Button handC;

    private Cursor panelCursor;
    private Cursor frameCrusor;


    public TestFrame_Cursor(){
        super("Cursor frame");
        setLayout(new BorderLayout());
        setSize(700,400);

        buttonPanel = new Panel();

        crosshairC = new Button("CROSSHAIR_CURSOR");
        waitC = new Button("WAIT_CURSOR");
        defaultC = new Button("DEFAULT_CURSOR");
        textC = new Button("TEXT_CURSOR");
        handC = new Button("HAND_CURSOR");

        crosshairC.addActionListener(this);
        waitC.addActionListener(this);
        defaultC.addActionListener(this);
        textC.addActionListener(this);
        handC.addActionListener(this);

        buttonPanel.add(crosshairC);
        buttonPanel.add(waitC);
        buttonPanel.add(defaultC);
        buttonPanel.add(textC);
        buttonPanel.add(handC);

        panelCursor = new Cursor(Cursor.MOVE_CURSOR);
        frameCrusor = new Cursor(Cursor.WAIT_CURSOR);

        buttonPanel.setCursor(panelCursor);
        this.setCursor(frameCrusor);

        add("North", buttonPanel);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == crosshairC){
            frameCrusor = new Cursor(Cursor.CROSSHAIR_CURSOR);
            this.setCursor(frameCrusor);
        }
        if (e.getSource() == waitC){
            frameCrusor = new Cursor(Cursor.WAIT_CURSOR);
            this.setCursor(frameCrusor);
        }
        if (e.getSource() == defaultC){
            frameCrusor = new Cursor(Cursor.DEFAULT_CURSOR);
            this.setCursor(frameCrusor);
        }
        if (e.getSource() == textC){
            frameCrusor = new Cursor(Cursor.TEXT_CURSOR);
            this.setCursor(frameCrusor);
        }
        if (e.getSource() == handC){
            frameCrusor = new Cursor(Cursor.HAND_CURSOR);
            this.setCursor(frameCrusor);
        }


    }
}
