package h03;

import java.awt.*;
import java.applet.*;

public class FillArc extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval (20,20,100,100);
        g.drawOval(20, 20, 100, 100);
    }
}

