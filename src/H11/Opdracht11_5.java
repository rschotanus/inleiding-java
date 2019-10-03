package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5 extends Applet{
    int count,x,y, teller;
    public void init() {
        count = 5;
        int y = 20;
        int x = 20;

    }
    @Override
    public void paint(Graphics g) {
        for (teller = 1; teller <= count; teller++) {
            y+= 20;
            x+= 20;
            g.drawRect(y,x,20,20);
        }
    }

}