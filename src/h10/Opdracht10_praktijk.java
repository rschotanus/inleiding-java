package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_praktijk extends Applet{
    TextField tv1;
    Button knop;
    double invoer;
    String uitslag;

    public void init() {
        tv1 = new TextField(20);
        knop = new Button("Ok");

        knop.addActionListener( new knopListener());

        add(tv1);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Uw cijfer is " + uitslag, 20,50);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = Double.parseDouble(tv1.getText());
            if(invoer <= 3.0){
                uitslag = "Slecht";
            }else if (invoer == 4.0 ){
                uitslag = "Onvoldoende";
            }else if (invoer == 5.0){
                uitslag = "Matig";
            }else if (invoer >= 6.0 && invoer <= 7.0){
                uitslag = "Voldoende";
            }else if (invoer >= 7.0 && invoer <= 10.0){
                uitslag = "Goed";
            }else{
                uitslag = "Onjuiste cijfer";
            }
            repaint();
        }
    }
}