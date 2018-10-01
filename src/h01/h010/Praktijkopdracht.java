package h01.h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    int getal;

    public void init(){
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new TekstvakListener());
        tekst ="";
        label = new Label("Voer hier het cijfer in");
        add(label);
        add(tekstvak);

    }
    public void paint(Graphics g) {
        g.drawString(tekst, 50,60);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            switch(getal) {
                case 1:
                    tekst= "Slecht";
                    break;
                case 2:
                    tekst= "Slecht";
                    break;
                case 3:
                    tekst= "Slecht";
                    break;
                case 4:
                    tekst= "Onvoldoende";
                    break;
                case 5:
                    tekst= "Matig";
                    break;
                case 6:
                    tekst= "Voldoende";
                    break;
                case 7:
                    tekst= "Voldoende";
                    break;
                case 8:
                    tekst= "Goed";
                    break;
                case 9:
                    tekst= "Goed";
                    break;
                case 10:
                    tekst= "Goed";
                    break;
                  default:
                      tekst = "Het verkeerde cijfer is ingevoerd!";
            }
            repaint();
        }
    }
}