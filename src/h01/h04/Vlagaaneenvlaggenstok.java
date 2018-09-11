package h01.h04;

import java.awt.*;
import java.applet.*;

public class Vlagaaneenvlaggenstok extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(150, 35, 100, 30);
        g.setColor(Color.blue);
        g.fillRect(150, 90, 100, 30);
        g.setColor(Color.black);
        g.drawLine(150,170,150,35);
    }
}