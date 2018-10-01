package h01.h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Schrikkeljaaraangeven extends Applet {
    TextField tekstvak,tekstvak2;
    Label label;
    String s, tekst;
    int maand;
    int jaartal;
    int feb;

    public void init() {
        tekstvak = new TextField("",10);
        tekstvak2 = new TextField("",10);
        label = new Label("Type hier het maandnummer in");
        tekstvak.addActionListener( new TekstvakListener());
        tekstvak.addActionListener( new Tekstvak2Listener());
        tekst = "";
        feb = 28;
        feb = 29;
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s );
            switch(maand) {
                case 1:
                    tekst = "Januari,31 dagen";
                    break;
                case 2:
                    tekst = "Februari,28 dagen";
                    break;
                case 3:
                    tekst = "Maart,31 dagen";
                    break;
                case 4:
                    tekst = "April,30 dagen";
                    break;
                case 5:
                    tekst = "Mei,31 dagen";
                    break;
                case 6:
                    tekst = "Juni,30 dagen";
                    break;
                case 7:
                    tekst = "Juli,31 dagen";
                    break;
                case 8:
                    tekst = "Augustus,31 dagen";
                    break;
                case 9:
                    tekst = "September,30 dagen";
                    break;
                case 10:
                    tekst = "Oktober,31 dagen";
                    break;
                case 11:
                    tekst = "November,30 dagen";
                    break;
                case 12:
                    tekst = "December,31 dagen";
                    break;

            }
            repaint();
        }
    }
    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
                feb = 29;
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
                feb  = 28;
            }
            repaint();
        }
    }
}









