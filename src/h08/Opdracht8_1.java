package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_1 extends Applet {
    Button knop;
    String schermtekst;
    TextField tekstvak;
    Label label;
    Button knop2;
    String tekst;

    public void init() {
        setSize(1600, 900);


        tekstvak = new TextField("",20);
        label = new Label("Plaats hier uw wachtwoord");

        //knop
        knop = new Button();
        knop.setLabel("Ok");
        knop.addActionListener(new TekstvakListener());
        knop2 = new Button();
        knop2.setLabel("refresh");
        knop2.addActionListener(new RefreshListener());
        add(knop2);
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);
        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }
    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            repaint();
        }
    }
    //text refresser
    class RefreshListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = "";
            tekstvak.setText("");
            repaint();
        }
    }

}