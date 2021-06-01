package sk.stuba.fei.uim.oop.Prednaska10_Cursory_Fonty;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FontFrame extends Frame implements ItemListener {
    Panel fontPanel;
    Choice fontName;
    Choice fontType;
    Choice fontSize;
    String[] fonts;
    String[] types = {"Plain", "Bold", "Italic", "Bold & Italic"};
    String[] size = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "34"};

    String fontNameSelected;
    int fontTypeSelected;
    int fontSizeSelected;


    public FontFrame(){
        super("Font Test");
        setLayout(new BorderLayout());
        setSize(500,400);

        fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontPanel = new Panel();
        fontName = new Choice();
        fontSize = new Choice();
        fontType = new Choice();

        fontName.addItemListener(this);
        fontType.addItemListener(this);
        fontSize.addItemListener(this);

        for (String font : fonts) {
            fontName.add(font);
        }
        for (String s : size) {
            fontSize.add(s);
        }
        for (String type : types) {
            fontType.add(type);
        }

        fontName.select(0);
        fontNameSelected = fontName.getSelectedItem();

        fontType.select(0);
        fontTypeSelected = fontType.getSelectedIndex();

        fontSize.select(0);
        fontSizeSelected = Integer.parseInt(fontSize.getSelectedItem());

        fontPanel.add(fontName);
        fontPanel.add(fontType);
        fontPanel.add(fontSize);

        add("North", fontPanel);

        setVisible(true);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == fontName){
            fontNameSelected = fontName.getSelectedItem();
        }
        if(e.getSource() == fontType){
            fontTypeSelected = fontType.getSelectedIndex();
        }
        if(e.getSource() == fontSize){
            fontSizeSelected = Integer.parseInt(fontSize.getSelectedItem());
        }

        repaint();
    }

    public void paint(Graphics g){
        int x = 150;
        int y = 200;

        Font font = new Font(fontNameSelected, fontTypeSelected, fontSizeSelected);
        g.setFont(font);
        g.drawString(fontNameSelected + " "+ types[fontTypeSelected] + " ," + fontSizeSelected, x, y);
    }
}
