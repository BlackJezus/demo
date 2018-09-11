package h01.h02;

import java.awt.*;
import java.applet.*;

    public class Blauwgeel extends Applet {

        public void init() {
            setBackground(Color.blue);
        }

        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Tariq Dilrosun", 50, 60);
        }
    }
