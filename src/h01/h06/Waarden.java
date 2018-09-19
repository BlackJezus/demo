package h01.h06;

import java.awt.*;
import java.applet.*;


public class Waarden extends Applet {
    int a;
    int b;

    int uitkomst;


    public void init() {
        a =8 ;
        b = 8;
        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + -uitkomst, 20, 20);
    }
}