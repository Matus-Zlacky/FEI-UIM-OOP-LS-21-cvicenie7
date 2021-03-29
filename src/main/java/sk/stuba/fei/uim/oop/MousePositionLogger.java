package sk.stuba.fei.uim.oop;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePositionLogger extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint().toString());
    }
}
