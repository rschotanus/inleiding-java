package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int i = 0;
        int size = 300;
        int location = 0;
        for(i = 0; i < 5; i++) {
            size -= 40;
            location += 20;
            g.drawOval(location,location,size,size);
        }
    }
}



