package h01.h06;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double uitkomst;

    public void init() {
        a =  5.9;
        b =  6.3;
        c =  6.9;
        d = 10;
        e = 3;
        f = 10;
        uitkomst =  (int)((a + b + c)*d/e)/f;
    }



        public void paint (Graphics g) { g.drawString("Het gemiddelde is: " + uitkomst,20,20);
    }
}

