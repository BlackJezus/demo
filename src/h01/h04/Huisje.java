package h01.h04;

import java.awt.*;
import java.applet.*;

public class Huisje extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(130,120,200,20);
        g.drawLine(270,120,200,20);
        g.drawLine(130,120,270,120);
        g.drawRect(131, 120, 138, 100);
        g.drawRect(150,172,30,48);
        g.drawRect(210,172,30,28);


    }
}