package h03;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.white);
        g.fillRoundRect (50,50,150,150,30, 30);
        g.drawRoundRect(50, 50, 150, 150, 30, 30);
        g.setColor(Color.black);
        g.fillOval (65,65,50,50);
        g.drawOval(65, 65, 50, 50);
        g.setColor(Color.black);
        g.fillOval (65,140,50,50);
        g.drawOval(65, 140, 50, 50);
        g.setColor(Color.black);
        g.fillOval (135,140,50,50);
        g.drawOval(135, 140, 50, 50);
        g.setColor(Color.black);
        g.fillOval (135,65,50,50);
        g.drawOval(135, 65, 50, 50);

    }
}
