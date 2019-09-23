package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_3 extends Applet {
    TextField tekstvak;
    Button knop;
    int invoer;
    String tekst;
    public void init() {
        setSize(500,400);

        tekstvak = new TextField(1);
        knop = new Button("Bereken");

        add(tekstvak);
        add(knop);

        knop.addActionListener(new knoplistener());
    }
    public class knoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Integer.parseInt(String.valueOf(invoer));
            invoer = Integer.parseInt(tekstvak.getText());
            int maand = invoer;
            switch (maand){
                case 1:
                    tekst = "Januari en bestaat uit 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari en bestaat uit 28 of 29 dagen.";
                    break;
                case 3:
                    tekst = "Maart en bestaat uit 31 dagen.";
                    break;
                case 4:
                    tekst = "April en bestaat uit 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei en bestaat uit 31 dagen.";
                    break;
                case 6:
                    tekst = "Juni en bestaat uit 30 dagen.";
                    break;
                case 7:
                    tekst = "Juli en bestaat uit 31 dagen.";
                    break;
                case 8:
                    tekst = "Augustus en bestaat uit 31 dagen.";
                    break;
                case 9:
                    tekst = "September en bestaat uit 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober en bestaat uit 31 dagen.";
                    break;
                case 11:
                    tekst = "November en bestaat uit 30 dagen.";
                    break;
                case 12:
                    tekst = "December en bestaat uit 31 dagen.";
                    break;
                default:
                    tekst = "Ongeldig";
                    break;

            }
            repaint();
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawString("Dit is de maand:" + tekst, 100, 100);
    }

}