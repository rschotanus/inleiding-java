
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {
        //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Rogier", 150, 160);
        g.setColor(Color.yellow);
        g.drawString("Schotanus", 140, 170);

    }

}

