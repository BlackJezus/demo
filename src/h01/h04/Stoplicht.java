package h01.h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(150, 70, 80, 160);
        g.fillRect(150, 70, 80, 160);
        g.fillOval(150,30,80,80);
        g.drawOval(150,30,80,80);
        g.fillOval(150,191,80,80);
        g.drawOval(150,190,80,80);
        g.setColor(Color.red);
        g.fillOval(162,50,55,55);
        g.drawOval(162,50,55,55);
        g.setColor(Color.orange);
        g.fillOval(162,120,55,55);
        g.drawOval(162,120,55,55);
        g.setColor(Color.green);
        g.fillOval(162,190,55,55);
        g.drawOval(162,190,55,55);
        g.setColor(Color.black);
        g.drawRect(165, 250, 50, 160);
        g.fillRect(165, 250, 50, 160);
    }
}