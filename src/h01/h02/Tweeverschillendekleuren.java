package h01.h02;

import java.awt.*;
import java.applet.*;

public class Tweeverschillendekleuren extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Tariq", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Dilrosun", 50, 70 );

    }
}