package h03;

import java.awt.*;
import java.applet.*;

import static java.awt.Color.black;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor (black);
        g.fillRect (150,20,50,100);
        g.drawRect(150, 20, 50, 100);
        g.setColor (Color.white);
        g.drawRect(150, 20, 50, 100);
        g.setColor (Color.white);
        g.drawOval(175, 120, 1, 70);
        g.setColor(Color.green);
        g.fillOval (165,30,20,20);
        g.drawOval(165, 30, 20, 20);
        g.setColor(Color.orange);
        g.fillOval (165,60,20,20);
        g.drawOval(165, 60, 20, 20);
        g.setColor(Color.red);
        g.fillOval (165,90,20,20);
        g.drawOval(165, 90, 20, 20);
    }
}
