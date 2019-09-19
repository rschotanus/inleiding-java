package h08;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk extends Applet {

    Button plusknop, minknop, keerknop, deelknop;
    TextField tv1, tv2;
    @Override
    public void init() {
        setSize(600,400);
        tv1 = new TextField(4);
        add(tv1);
        tv2 = new TextField(4);
        add(tv2);

        //plus knop
        plusknop = new Button("+");
        plusknop.addActionListener (new PlusKnopListener());
        add(plusknop);

        //min knop
        minknop = new Button("-");
        minknop.addActionListener (new MinKnopListener());
        add(minknop);

        //keer knop
        keerknop = new Button("*");
        keerknop.addActionListener (new KeerKnopListener());
        add(keerknop);

        //deel knop
        deelknop = new Button("/");
        deelknop.addActionListener (new DeelKnopListener());
        add(deelknop);
    }

    class PlusKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText ();
            String invoer2 = tv2.getText ();
            double Vak1 = Double.parseDouble (invoer1);
            double Vak2 = Double.parseDouble (invoer2);
            double uitkomst = Vak1 + Vak2;
            tv1.setText (String.valueOf (uitkomst));
            tv2.setText (" ");
       }

    }class MinKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText ();
            String invoer2 = tv2.getText ();
            double Vak1 = Double.parseDouble (invoer1);
            double Vak2 = Double.parseDouble (invoer2);
            double uitkomst = Vak1 - Vak2;
            tv1.setText (String.valueOf (uitkomst));
            tv2.setText (" ");
        }

    }class KeerKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText ();
            String invoer2 = tv2.getText ();
            double Vak1 = Double.parseDouble (invoer1);
            double Vak2 = Double.parseDouble (invoer2);
            double uitkomst = Vak1 * Vak2;
            tv1.setText (String.valueOf (uitkomst));
            tv2.setText (" ");

        }

    }class DeelKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText ();
            String invoer2 = tv2.getText ();
            double Vak1 = Double.parseDouble (invoer1);
            double Vak2 = Double.parseDouble (invoer2);
            double uitkomst = Vak2 / Vak2;
            tv1.setText (String.valueOf (uitkomst));
            tv2.setText (" ");
        }
    }
}

