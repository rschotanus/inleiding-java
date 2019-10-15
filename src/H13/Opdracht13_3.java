package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht13_3 extends Applet {

    Button redbrick,greybrick;
    boolean isBrick;
    boolean isClicked;


    @Override
    public void init() {
        setSize(800, 600);

        redbrick = new Button("Red Brick");
        redbrickListener B = new redbrickListener();
        redbrick.addActionListener( B );
        add(redbrick);

        greybrick = new Button("Grey Brick");
        concretebrickListener C = new concretebrickListener();
        greybrick.addActionListener( C );
        add(greybrick);

    }

    @Override
    public void paint(Graphics g) {

        if (isClicked) {
            if (isBrick) {
                reddrawbrickwall(g);
            } else {
                concretebrickwall(g);
            }
        }

    }
    void reddrawbrickwall(Graphics g) {
        int pattern = 0;
        setBackground(new Color(150, 150, 150));

        Color b1= new Color(165, 60, 68);
        Color b2= new Color(124, 23, 72);
        Color b3= new Color(191, 90, 50);

        for (int y = 0; y < 1000; y += 24) {
            for (int x = 0; x < 2000; x += 74) {
                int b = (int) (Math.random()*3+1);
                if(b == 1) g.setColor(b1);
                if(b == 2) g.setColor(b2);
                if(b == 3) g.setColor(b3);

                if(pattern == 0)
                    g.fillRect(x, y, 70, 20);
                else
                    g.fillRect(x-35, y, 70, 20);
            }
            if(pattern == 0)pattern=1;
            else pattern=0;
        }
    }

    void concretebrickwall(Graphics g) {
        int pattern = 0;
        setBackground(new Color(0, 0, 0));

        Color b1 = new Color(180, 180, 180);
        Color b2 = new Color(180, 165, 190);
        Color b3 = new Color(160, 180, 200);

        for (int y = 0; y < 1000; y += 40) {
            for (int x = 0; x < 2000; x += 90) {
                int b = (int) (Math.random() * 3 + 1);
                if (b == 1) g.setColor(b1);
                if (b == 2) g.setColor(b2);
                if (b == 3) g.setColor(b3);

                if (pattern == 0)
                    g.fillRect(x, y, 87, 37);

                else
                    g.fillRect(x - 35, y, 87, 37);
            }
            if (pattern == 0) pattern = 1;
            else pattern = 0;
        }

    }

    class redbrickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            isBrick = true;
            isClicked = true;
            repaint();
        }
    }

    class concretebrickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            isBrick = false;
            isClicked = true;
            repaint();
        }
    }

}