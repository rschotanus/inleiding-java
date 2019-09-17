package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {

    int totaal;
    int man;
    int vrouw;
    int jongen;
    int meisje;
    Button knojongen;
    Button knomeisje;
    Button knopjongen;
    Button knopmeisje;

    public void init() {
        setSize(1600, 900);
        knojongen = new Button("Mannelijke");
        knojongenListener kml = new knojongenListener();
        knojongen.addActionListener( kml );
        add(knojongen);
        knomeisje = new Button("Vrouwlijke");
        knomeisjeListener kvl = new knomeisjeListener();
        knomeisje.addActionListener( kvl );
        add(knomeisje);
        knopjongen = new Button("jongens");
        knopjongenListener kpml = new knopjongenListener();
        knopjongen.addActionListener( kpml );
        add(knopjongen);
        knopmeisje = new Button("meisjes");
        knopmeisjeListener kpvl = new knopmeisjeListener();
        knopmeisje.addActionListener( kpvl );
        add(knopmeisje);
    }

    public void paint(Graphics g) {
        g.drawString("Mannen : " + man,50,80);
        g.drawString("Vrouwen : " + vrouw, 50, 120);
        g.drawString("Potentiële mannen : " + jongen, 50, 160);
        g.drawString("Potentiële vrouwen : " + meisje, 50, 200);
        g.drawString("Totaal : " + totaal, 50, 240);
    }
    class knojongenListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            man = man + 1;
            totaal = totaal + 1;
            repaint();
        }
    }
    class knomeisjeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }
    class knopjongenListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jongen = jongen + 1;
            totaal = totaal + 1;
            repaint();
        }
    }
    class knopmeisjeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            meisje = meisje + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

}