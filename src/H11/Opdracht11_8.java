package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int i = 0;
        int size = 600;
        int location = 0;
        for(i = 0; i < 100; i++) {
            size -= 5;
            location += 2.5;
            g.drawOval(location,location,size,size);
        }
    }
}
