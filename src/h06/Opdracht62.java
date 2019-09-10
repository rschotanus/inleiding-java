package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht62 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 60;
        b = 60;
        c = 1440;
        d = 60;
        e = 86400;
        f = 365;
        uitkomst = (a * b);
        uitkomst2 = (c * d);
        uitkomst3 = (e * f);
    }

    public void paint(Graphics g) {
        g.drawString("hoeveel seconde er in een uur zit: " + uitkomst, 20, 20);
        g.drawString("hoeveel seconde er in een dag zit: " + uitkomst2, 20, 40);
        g.drawString("hoeveel seconde er in een jaar zit: " + uitkomst3, 20, 60);
    }
}


