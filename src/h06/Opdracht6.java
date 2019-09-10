package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        c = 3;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("ieder krijgt: " + uitkomst, 20, 20);
    }
}

