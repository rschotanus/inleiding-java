package Challange;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staafdiagram extends Applet {

    Label ValerieLabel;
    Label JeroenLabel;
    Label HansLabel;
    Button okknop;

    int invoer3;
    int invoer2;
    int invoer1;
    int Beginlijn;
    private TextField valerie;
    private TextField jeroen;
    private TextField hans;


    public void init() {

        setSize(720, 480);

        //valerie
        ValerieLabel = new Label("Valerie");
        add(ValerieLabel);
        valerie = new TextField("",10);
        add(valerie);


        //jeroen
        JeroenLabel = new Label("Jeroen");
        add(JeroenLabel);
        jeroen = new TextField ("",10);
        add(jeroen);


        //Hans
        HansLabel = new Label("Hans");
        add(HansLabel);
        hans = new TextField("",10);
        add(hans);


        //knop
        okknop = new Button("toon");
        okknopListener ok = new okknopListener();
        okknop.addActionListener(ok);
        add(okknop);

    }

    public void paint(Graphics g) {
        invoer1 *=2;
        invoer2 *=2;
        invoer3 *=2;

        Beginlijn = 250;

        // Valery
        g.setColor(Color.orange);
        g.fillRect(90, Beginlijn - invoer1, 30, invoer1);
        // Jeroen
        g.setColor(Color.red);
        g.drawRect(150, Beginlijn - invoer2, 30, invoer2);
        // Hans
        g.setColor(Color.yellow);
        g.fillRect(210, Beginlijn - invoer3, 30, invoer3);
        //nummers
        g.setColor(Color.black);
        g.drawString("1",40,250);
        g.drawString("20",35,215);
        g.drawString("40",35,175);
        g.drawString("60",35,135);
        g.drawString("80",35,95);
        g.drawString("100",28,55);
        //horizontal
        g.fillRect(50,50,2,200);
        g.drawRect(50,50,2,200);
        //vertical
        g.fillRect(50,250,200,2);
        g.drawRect(50,250,200,2);
        //namen
        g.drawString("valery", 90,265);
        g.drawString("Hans", 150,265);
        g.drawString("Jeroen", 210,265);

    }

    class okknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Integer.parseInt(String.valueOf(invoer1));
            invoer1 = Integer.parseInt(valerie.getText());

            Integer.parseInt(String.valueOf(invoer2));
            invoer2 = Integer.parseInt(jeroen.getText());

            Integer.parseInt(String.valueOf(invoer3));
            invoer3 = Integer.parseInt(hans.getText());

            repaint ();
        }
    }

}
