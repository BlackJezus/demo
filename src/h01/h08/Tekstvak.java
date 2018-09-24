package h01.h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstvak extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;
    Label label;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("reset");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());
        label = new Label ("");
        add(tekstvak);
        add(knop);
        add(knop2);
        add(label);


    }

    public void paint(Graphics g) {
        label.setLocation(50,50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            label.setText(s);


            repaint();
        }
    }
            class Knop2Listener implements ActionListener	{
                public void actionPerformed( ActionEvent e ) {
                    tekstvak.setText("");
                    repaint();{
                    }
                }
    }
}




