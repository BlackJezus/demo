package h01.h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(100,50,200,200,10,10);
        g.setColor(Color.black);
        g.fillOval(122,75,70,70);
        g.drawOval(121,75,70,70);
        g.fillOval(210,75,70,70);
        g.drawOval(210,75,70,70);
        g.fillOval(210,165,70,70);
        g.drawOval(210,165,70,70);
        g.fillOval(120,165,70,70);
        g.drawOval(120,165,70,70);



    }
}