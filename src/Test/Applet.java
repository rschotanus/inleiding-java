// Import needed classes

import java.awt.*;

/**
 *  This applet displays a message in random colors and locations on the screen
 *  Color selection is made by random numbers used to allocate the amount of red,
 *  green and blue used to color the text. 5 fonts are created and each time the
 *  message is drawn one of the fonts is chosen at random.
 */
public class Applet extends java.applet.Applet {

    // instance variable declarations
    String message;  // The message to be displayed.  This can be set in
    // an applet param with name "message".  If no
    // value is provided in the applet tag, then
    // the string "Java!" is used as the default.

    Font font1, font2, font3, font4, font5;  // The five fonts.

    /**
     init is called by the web browser when the applet is first loaded.
     This is where you want to put code that you only want to execute once.
     The Font objects and text message only need to be initialized once.
     */
    public void init() {
        // getParameter() reads a parameter from the HTML file, if one was not specified,
        //  the default text is "Java". You can ignore this for now....
        message = getParameter("message");
        if (message == null)
            message = "Java!";

        // initialize the 5 Font objects
        font1 = new Font("Serif", Font.BOLD, 14);
        font2 = new Font("SansSerif", Font.BOLD + Font.ITALIC, 24);
        font3 = new Font("Monospaced", Font.PLAIN, 20);
        font4 = new Font("Dialog", Font.PLAIN, 30);
        font5 = new Font("Serif", Font.ITALIC, 36);

    } // end init()

    /**
     paint is called every time the applet needs to be redrawn (the display needs
     to be refreshed).
     */
    public void paint(Graphics g) {

        int width = getSize().width;   // Get this component's width.
        int height = getSize().height; // Get this component's height.

        int i = 0;  // loop counter
        while ( i < 25 ) {     // Draw 25 Strings on the screen
            // Draw one string.  First, set the font to be one of the five
            // available fonts, at random.
            int fontNum = (int)(5*Math.random()) + 1;
            if(fontNum == 1) {
                g.setFont(font1);    // What type of variable is font1?
            } else if(fontNum == 2) {
                g.setFont(font2);    // Where was font2 declared?
            } else if(fontNum == 3) {
                g.setFont(font3);    // Why can we access font3 here?
            } else if(fontNum == 4) {
                g.setFont(font4);
            } else  {
                g.setFont(font5);
            } // end extended if-else

            // Set the color to a random color
            float red = (float)Math.random();
            float green = (float)Math.random();
            float blue = (float)Math.random();
            Color randomColor = new Color(red, green, blue);
            g.setColor( randomColor );

            // Select the position of the string, at random.
            int x,y;
            x = -50 + (int)(Math.random()*(width+40));
            y = (int)(Math.random()*(height+20));

            // Draw the message.
            g.drawString(message,x,y);

            // Update loop counter
            i++;
        } // end while
    } // end paint method
}  // end class RandomStrings