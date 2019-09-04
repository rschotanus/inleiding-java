package h03;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
       g.drawPolygon(new int[]  {100, 150, 200}, new int[] {100, 50, 100}, 3);
        g.drawRect(100, 100 , 100, 100);
        g.drawRect(160, 150, 25, 50);
        g.drawRect(115, 125, 25, 25);
        g.setColor (Color.red);
        g.fillRect (115,30,15,5);
        g.drawRect(115, 40, 15, 5);
        g.setColor (Color.white);
        g.fillRect (115,35,15,5);
        g.drawRect(115, 35, 15, 5);
        g.setColor (Color.blue);
        g.fillRect (115,40,15,5);
        g.drawRect(115, 30, 15, 5);
        g.setColor (Color.yellow);
        g.drawOval(130, 45, 1, 25);
    }
}