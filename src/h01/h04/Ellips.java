package h01.h04;

import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawArc(50,50,100,50,90,360);
        g.fillArc(50,50,100,50,90,360);
    }
}