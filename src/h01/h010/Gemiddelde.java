package h01.h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Gemiddelde extends Applet {

    TextField tekstvak;

    double invoer;
    double voldoende;
    double totaal;
    double gemiddelde;
    int aantal;
    String s;
    String result;
    String uitslaggeslaagd;
    Button knop;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        knop = new Button("OK");
        knop.addActionListener(new  KnopListener());
        gemiddelde = 0.0;
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString("Het cijfer is: " + result, 50, 80);
        g.drawString("Gemiddeld cijfer: " + gemiddelde, 50, 100);
        g.drawString("Geslaagd of gezakt: " + uitslaggeslaagd, 50, 120);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            voldoende = 5.5;
            s = tekstvak.getText();
            invoer = Double.parseDouble(s);

            totaal += invoer;
            aantal++;
            gemiddelde = totaal / aantal;

            if ((invoer >= voldoende)) {
                result = "Voldoende";

            } else {
                result = "Onvoldoende";

            }
            repaint();

        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            if ((gemiddelde >= 5.5)) {
                uitslaggeslaagd = "Je bent geslaagd";
            } else {

                uitslaggeslaagd = "Je bent gezakt";
            }

            repaint();
        }


    }


}