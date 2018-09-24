package h01.h08;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Vieraantallen extends Applet {
    String s;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int persoon1, persoon2, persoon3, persoon4;

    public void init() {
        knop = new Button("Man");
        knop2 = new Button("Vrouw");
        knop3 = new Button("Vrouwelijke Leerlingen");
        knop4 = new Button("Mannelijke leerlingen");
        knop.addActionListener( new KnopListener());
        knop2.addActionListener( new Knop2Listener());
        knop3.addActionListener( new Knop3Listener());
        knop4.addActionListener( new Knop4Listener());
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        s = "";


    }

    public void paint (Graphics g) {
        g.drawString("Man" + persoon1,50,50);
        g.drawString("Vrouw" + persoon2,50,60);
        g.drawString("Mannelijke leerlingen" + persoon3,50,70);
        g.drawString("Vrouwelijke leeringen" + persoon4,50,80);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            persoon1 = 0 + persoon1;
            persoon1++;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            persoon2 = 0 + persoon2;
            persoon2++;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            persoon3 = 0 + persoon3;
            persoon3++;
            repaint();
        }
    }
    class Knop4Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            persoon4 = 0 + persoon4;
            persoon4++;
            repaint();
        }
    }
}









