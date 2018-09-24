package h01.h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Btw extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String s;
    double getal,num;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Inclusief btw " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );

            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            num = Double.parseDouble( s );
            getal = num * 1.21;

            repaint();
        }
    }
}