package h01.h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.drawRect(200, 100, 40, 190);
        g.fillRect(200, 100, 40, 190);
        g.setColor(Color.red);
        g.drawRect(120, 219, 40, 70);
        g.fillRect(120, 219, 40, 70);
        g.setColor(Color.blue);
        g.drawRect(280, 140, 40, 150);
        g.fillRect(280, 140, 40, 150);
        g.setColor(Color.black);
        g.drawLine(105,290,320,290);
        g.drawLine(105,290,105,10);
        g.drawString("Valerie",123,308);
        g.drawString("Jeroen",200,308);
        g.drawString("Hans",285,308);
        g.drawString("0",90,308);
        g.drawString("100",80,110);
        g.drawString("80",85,150);
        g.drawString("60",85,190);
        g.drawString("40",85,230);
        g.drawString("20",85,275);
        g.drawString("120",80,69);

    }
}