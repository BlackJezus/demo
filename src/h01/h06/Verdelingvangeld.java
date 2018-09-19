package h01.h06;//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class Verdelingvangeld extends Applet {
    double a;
    double b;
    int c;
    double uitkomst,uit1 ,uit2,uit3,uit4;

    public void init() {
        a =56.50;
        b =56.50 ;
        c = 4;
        uitkomst = ((a + b) / c);
        uit1 = ((a + b) / c);
        uit2 = ((a + b) / c);
        uit3 = ((a + b) / c);
        uit4 = ((a + b) / c);




    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Jan:" + uit1,20,40);
        g.drawString("Ali:" + uit2,20,60);
        g.drawString("Jeannette:" + uit3,20,80);
        g.drawString("Tariq:" + uit4,20,100);

    }
}