package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht63 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 20;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}


