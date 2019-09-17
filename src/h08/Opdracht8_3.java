package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_3 extends Applet {

    Button okKnop;
    Label label;
    TextField txtfield;
    int input;
    double VATAmount;
    public void init() {
        setSize(600,400);
        label = new Label("Calculate VAT:");
        add(label);
        txtfield = new TextField("",15);
        add(txtfield);
        okKnop = new Button();
        okKnop.setLabel( "Calculate" );
        okKnop.addActionListener( new okKnopListener() );
        add(okKnop);
    }
    public void paint(Graphics g) {
        g.drawString("VAT include: " + VATAmount, 25,50);
    }
    class okKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            input = Integer.parseInt(txtfield.getText());
            VATAmount = input * 1.21;
            txtfield.setText("");
            repaint();
        }
    }
}