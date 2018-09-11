package h01.h05;

import java.awt.*;
import java.applet.*;

public class Staafdiagramvanh04 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
       int Valerie = 40;
       int Jeroen = 100;
       int Hans = 80;


        g.setColor(Color.yellow);
        g.fillRect(200, 15, 40, Jeroen);
        g.setColor(Color.red);
        g.fillRect(120, 15, 40, Valerie);
        g.setColor(Color.blue);
        g.fillRect(280, 15, 40, Hans);
        g.setColor(Color.black);
        g.drawString("Valerie",123,15);
        g.drawString("Jeroen",200,15);
        g.drawString("Hans",285,15);
        g.drawString("0",90,18);
        g.drawString("100",80,118);
        g.drawString("80",85,99);
        g.drawString("60",85,77);
        g.drawString("40",85,55);
        g.drawString("20",85,35);
        g.drawString("120",80,139);

    }
}

