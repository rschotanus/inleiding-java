package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht64 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = Math.round (a + b + c) *10/3;
        uitkomst = uitkomst/10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);
    }
}


