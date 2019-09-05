package h03;

import java.awt.*;
import java.applet.*;

public class StaadDiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.drawRect(200, 40, 25, 100);

        g.drawRect(150, 65, 25, 100);

        g.drawRect(100, 90, 25, 100);
    }
}