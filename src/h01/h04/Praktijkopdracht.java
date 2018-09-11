package h01.h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20,30,150,30);
        g.drawRect(20, 60,130,50);
        g.drawRoundRect(20,140,130,55,20,20);
        g.setColor(Color.magenta);
        g.drawRect(170, 60,130,50);
        g.fillRect(170,60,130,50);
        g.setColor(Color.BLACK);
        g.drawOval(170,60,130,50);
        g.setColor(Color.magenta);
        g.drawOval(170,140,130,50);
        g.fillOval(170,140,130,50);
        g.setColor(Color.black);
        g.drawOval(345,60,130,50);
        g.setColor(Color.magenta);
        g.fillArc(345, 60, 130, 50, 0, 45);
        g.setColor(Color.black);
        g.drawOval(340,135,65,60);
        g.drawString("Lijn",70,45);
        g.drawString("Rechthoek",55,125);
        g.drawString("Afgeronde rechthoek",35,210);
        g.drawString("Gevulde rechthoek met ovaal",155,125);
        g.drawString("Gevulde ovaal",195,210);
        g.drawString("Cirkel",357,210);
        g.drawString("Taartpunt met ovaal eromheen",325,125);

    }
}