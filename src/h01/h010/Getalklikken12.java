package h01.h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Getalklikken12 extends Applet {

    int getal;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new TekstvakListener());
        tekst = "";
        label = new Label( "Vul hier het getal in");
        add(label);
        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50,45);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s;
            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > 20) {
                tekst = "Grootste getal";
            }
            else {
                tekst = "Kleinste getal";
            }
                repaint();
            }
        }
    }

