package h01.h06;//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Dag extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int uitkomst, uit1 , uit2 , uit3;



    public void init() {
        a = 60;
        b = 60;
        c = 3600;
        d = 24;
        e = 365;
        uitkomst = (a * b);
        uit1 = (c * d);
        uit2 = (c * d)*e;


    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + uitkomst, 20, 20);
        g.drawString("Seconden in een dag: " + uit1, 20,40);
        g.drawString("Seconden in een jaar: " + uit2,20,60);


    }
}