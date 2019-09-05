package h03;

import java.awt.*;
import java.applet.*;

public class StaadDiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.setColor (Color.blue);
        g.fillRect (200,40,25,200);
        g.drawRect(200, 40, 25, 200);
        g.setColor (Color.white);
        g.fillRect (150,80,25,160);
        g.drawRect(150, 80, 25, 160);
        g.setColor (Color.red);
        g.fillRect (100,160,25,80);
        g.drawRect(100, 160, 25, 80);
        g.setColor (Color.white);
        g.drawOval(70, 40, 1, 200);

        g.drawOval(70, 240, 180, 1);
        
        g.drawString("1", 60, 245);

        g.drawString("100", 45, 45);

        g.drawString("80", 50, 85);

        g.drawString("60", 50, 125);

        g.drawString("40", 50, 165);

        g.drawString("20", 50, 205);

        g.drawString("Valerie", 320, 70);

        g.drawString("Hans", 320, 90);

        g.drawString("Jeroen", 320, 110);
        g.setColor(Color.RED);
        g.fillRect (280,60,10,10);
        g.drawRect(280, 60, 10, 10);
        g.setColor(Color.WHITE);
        g.fillRect (280,80,10,10);
        g.drawRect(280, 80, 10, 10);
        g.setColor(Color.BLUE);
        g.fillRect (280,100,10,10);
        g.drawRect(280, 100, 10, 10);
        g.setColor(Color.WHITE);
        g.drawRect(260, 50, 120, 70);
    }
}