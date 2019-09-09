package h03;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);
        g.setColor(Color.magenta);
        g.fillRect(140, 20, 100, 50);
        g.setColor(Color.black);
        g.drawOval(140, 20, 100, 50);
        g.setColor(Color.magenta);
        g.fillOval(140, 120, 100, 50);
        g.setColor(Color.black);
        g.drawRoundRect(20, 120, 100, 50, 20, 20);
        g.drawOval(290, 115, 50, 50);
        g.setColor(Color.magenta);
        g.fillArc(290, 20, 50, 50, 45, 45);
        g.drawArc(290, 20, 50, 50, 45, 45);
        g.setColor(Color.black);
        g.drawOval(290, 20, 50, 50);
        g.drawOval(20, 5, 100, 0);
        g.drawString("Rechthoek", 40, 90);
        g.drawString("Lijn", 60, 17);
        g.drawString("Gevulde rechthoek", 140, 90);
        g.drawString("Taartpunt met ovaal", 260, 90);
        g.drawString("Afgeronde rechthoek", 20, 190);
        g.drawString("Gevulde ovaal", 150, 190);
        g.drawString("Cirkel", 300, 190);
    }
}
