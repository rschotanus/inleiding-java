package h05;

import java.awt.*;
import java.applet.*;

public class variable extends Applet {
    //declaratie.
    Color Color;
    Color linecolor;
    int width;
    int height;
    private int X;
    private int Y;
    private int arcwidth;
    private int archeight;


    public void init() {
        //initialisatie.
        Color = Color.MAGENTA;
        linecolor = Color.BLACK;
        width = 200;
        height = 100;
        X = 100;
        Y = 70;
        arcwidth = 100;
        archeight = 100;
    }
    
    public void paint(Graphics g) {
        //teken rechthoek
        g.drawString("Rechthoek",170,215);
        g.drawRect (100, 100, width, height);
        //teken afgeronde rechthoek
        g.drawString("afgeronde rechthoek",140,340);
        g.drawRoundRect (100, 225, width, height, 30, 30);
        //teken gevulde rechthoek
        g.drawString("Gevulde rechthoek",365,215);
        g.setColor (Color);
        g.fillRect (315, 100, width, height);
        //teken ovaal
        g.setColor (linecolor);
        g.drawOval (315, 100, width, height);
        //teken gevulde ovaal
        g.drawString("Gevulde ovaal",370,340);
        g.setColor (Color);
        g.fillOval (315, 225, width, height);
        //teken Cirkel
        g.setColor (linecolor);
        g.drawString("Cirkel",605,340);
        g.drawOval (570, 225, arcwidth, archeight);
        //gevulde taartpunt met ovaal
        g.drawString("Taart punt met ovaal",570,215);
        g.setColor (Color);
        g.fillArc(525, 100, width, height, 30, 30);
        g.drawArc(525, 100, width, height, 30, 30);
        g.setColor (linecolor);
        g.drawOval (525, 100, width, height);
        //lijn
        g.drawLine(X,Y,X+width,Y);
        g.drawString("line",190,85);



    }
}