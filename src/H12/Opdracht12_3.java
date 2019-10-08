package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {

    int values[] = new int[5];
    TextField textFields[] = new TextField[5];
    boolean start ;

    public void init () {

        Button ok = new Button("ok");
        ok.addActionListener(new Oklistener());

        for (int i = 0; i < textFields.length; i++) {

            textFields[i] = new TextField(5);
            add(textFields[i]);
        }

        add(ok);
    }

    public void paint (Graphics g) {

        int valueY = 50;

        if (start) {

            for (int i = 0; i < textFields.length; i++) {

                g.drawString("" +values[i], 50, valueY);
                valueY += 20;
            }
        }
    }

    public class Oklistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < textFields.length; i++) {

                String s = textFields[i].getText();
                values[i] = Integer.parseInt(s);

                if ( i == 4 ) {

                    Arrays.sort(values);
                    start = true;
                }
            }

            repaint();
        }
    }

}
