package h01.h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Rekenmachine extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String s;
    Double getal, num,num2,num3;

    public void init() {
        label = new Label("");
        tekstvak = new TextField("",10);
        tekstvak2 = new TextField("",10);
        knop = new Button("*");
        knop.addActionListener( new KnopListener());
        knop2 = new Button("/");
        knop2.addActionListener( new Knop2Listener());
        knop3 = new Button("+");
        knop3.addActionListener( new Knop3Listener());
        knop4 = new Button("-");
        knop4.addActionListener( new Knop4Listener());
        add(tekstvak);
        add(tekstvak2);
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        add(label);
        s = "";
    }

    public void paint(Graphics g) {
        tekstvak.setText(" " + num3);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num = Double.parseDouble( s );
            String text = tekstvak2.getText();
            num2 = Double.parseDouble( text );
            num3 = Double.parseDouble( s );
            num3 = num*num2;



            repaint();
        }
    }
        class Knop2Listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                num = Double.parseDouble( s );
                String text = tekstvak2.getText();
                num2 = Double.parseDouble( text );
                num3 = Double.parseDouble( s );
                num3 = num/num2;

                repaint();
            }
        }
        class Knop3Listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                num = Double.parseDouble( s );
                String text = tekstvak2.getText();
                num2 = Double.parseDouble( text );
                num3 = Double.parseDouble( s );
                num3 = num+num2;

                repaint();

            }
        }
        class Knop4Listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                num = Double.parseDouble( s );
                String text = tekstvak2.getText();
                num2 = Double.parseDouble( text );
                num3 = Double.parseDouble( s );
                num3 = num-num2;

                repaint();
            }

    }



}