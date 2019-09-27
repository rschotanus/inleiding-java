package H11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_1 extends Applet {

    public void init() {}



        @Override
        public void paint(Graphics g) {
            for(int teller = 0; teller < 10; teller++){
                g.drawLine(50+20*teller, 50,  50+20*teller, 150);
                g.drawString("" + teller, 47+20*teller, 163);
            }
    }
}