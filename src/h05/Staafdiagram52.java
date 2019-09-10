package H5;

import java.awt.*;
import java.applet.*;

public class Staafdiagram52 extends Applet {

    int Valery;
    int Jeroen;
    int Hans;


    int Beginlijn;


    public void init() {

    }

    public void paint(Graphics g) {
        //niet de 2 veranderen
        Valery = 60                                       * 2;
        Hans = 40                                         * 2;
        Jeroen = 100                                      * 2;

        Beginlijn = 250;

        // Valery
        g.setColor(Color.orange);
        g.fillRect(90, Beginlijn - Valery, 30, Valery);
        // Jeroen
        g.setColor(Color.red);
        g.drawRect(150, Beginlijn - Hans, 30, Hans);
        // Hans
        g.setColor(Color.yellow);
        g.fillRect(210, Beginlijn - Jeroen, 30, Jeroen);
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

}