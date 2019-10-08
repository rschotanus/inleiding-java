package H12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    double gemiddelde[];
    double uitkomst[];
    double getal;
    double avg;

    public void init() {
        gemiddelde = new double[10];
        uitkomst = new double[10];
        getal = 0.00;
        for (int teller = 0; teller < gemiddelde.length; teller++) {
            gemiddelde[teller] = teller + 1;
            getal += gemiddelde[teller];
        }
        avg = (getal / gemiddelde.length);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < gemiddelde.length; teller++) {
            g.drawString("" + gemiddelde[teller], 50, 20 * teller + 20);
        }
        g.drawString("gemiddelde = " + avg, 120, 20);
    }
}