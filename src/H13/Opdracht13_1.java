package H13;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Opdracht13_1 extends JApplet {


    public void paint (Graphics g) {
        tekenDriehoek (g,75,100,100,25,125,100);
    }

    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        int x[] = {x1,x2,x3};
        int y[] = {y1,y2,y3};
        g.drawPolygon (x,y,3);
    }
}
