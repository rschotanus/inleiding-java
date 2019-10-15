package Challange;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Horeca extends Applet {

    double totaal;
    double fris;
    double bier;
    double wijn;
    double koffie;
    double buitgedist;
    double bingedist;
    Button knopfris;
    Button knopbier;
    Button knopwijn;
    Button knopkoffie;
    Button knopbingedist;
    Button knopbuitgedist;
    Button refreshButton;
    double A,B,C,D,E,F;

    public void init() {

        A = 2.25;
        B = 2.50;
        C = 2.75;
        D = 2;
        E = 3;
        F = 3.75;

        setSize(500, 500);
        //fris
        knopfris = new Button("fris");
        frisListener kml = new frisListener ();
        knopfris.addActionListener( kml );
        add(knopfris);
        //bier
        knopbier = new Button("bier");
        bierListener kvl = new bierListener ();
        knopbier.addActionListener( kvl );
        add(knopbier);
        //wijn
        knopwijn = new Button("wijn");
        wijnListener kpml = new wijnListener ();
        knopwijn.addActionListener( kpml );
        add(knopwijn);
        //koffie
        knopkoffie = new Button("koffie");
        koffieListener kpvl = new koffieListener ();
        knopkoffie.addActionListener( kpvl );
        add(knopkoffie);
        //binnen
        knopbingedist = new Button("binn gedist.");
        binListener kv1 = new binListener ();
        knopbingedist.addActionListener ( kvl );
        add(knopbingedist);
        //buiten
        knopbuitgedist = new Button("buit. gedist.");
        buitListener km1 = new buitListener ();
        knopbuitgedist.addActionListener ( kml );
        add(knopbuitgedist);
        //refresh
        refreshButton = new Button();
        refreshButton.setLabel("refresh");
        refreshButton.addActionListener(new RefreshListener());
        add(refreshButton);
    }
    public void paint(Graphics g) {
        g.drawString("Bestelling totaal : " + fris,50,80);
        g.drawString("Totaal dagomzet : "  , 50, 120);
    }
    class frisListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            fris = fris + A;
            bier = bier + B;
            wijn = wijn + C;
            koffie = koffie + D;
            bingedist = bingedist + E;
            buitgedist = buitgedist + F;
            totaal = totaal + 1;
            repaint();
        }
    }
    class bierListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            bier = bier + B;
            fris = fris + A;
            wijn = wijn + C;
            koffie = koffie + D;
            bingedist = bingedist + E;
            buitgedist = buitgedist + F;
            totaal = totaal + 1;
            repaint();
        }
    }
    class wijnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            wijn = wijn + C;
            fris = fris + A;
            bier = bier + B;
            koffie = koffie + D;
            bingedist = bingedist + E;
            buitgedist = buitgedist + F;
            totaal = totaal + 1;
            repaint();
        }
    }
    class koffieListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            koffie = koffie + D;
            fris = fris + A;
            bier = bier + B;
            wijn = wijn + C;
            bingedist = bingedist + E;
            buitgedist = buitgedist + F;
            totaal = totaal + 1;
            repaint();
        }
    }
    class binListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            bingedist = bingedist + E;
            fris = fris + A;
            bier = bier + B;
            wijn = wijn + C;
            koffie = koffie + D;
            buitgedist = buitgedist + F;
            totaal = totaal + 1 ;
            repaint ();
        }
    }
    class buitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            buitgedist = buitgedist + F;
            bingedist = bingedist + E;
            fris = fris + A;
            bier = bier + B;
            wijn = wijn + C;
            koffie = koffie + D;
            totaal = totaal + 1;
            repaint ();
        }
    }
    class RefreshListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            repaint();
        }
        }
}