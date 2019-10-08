package H12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht12_2 extends Applet {

    Button knop[];


    public void init() {
        knop = new Button [25];

        for (int teller = 0; teller < knop.length; teller ++) {
            Button b = new Button();
            knop[teller] = b;
            add(b);
        }
    }
}
