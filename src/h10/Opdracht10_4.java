package h10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Opdracht10_4 extends Applet {
    private static final long serialVersionUID = -6139947739901437712L;

    private TextField txF1;
    private TextField txF2;
    private Label monthLabel;
    private Label yearLabel;
    private String Months;
    private String totalDays;
    private String year;
    private int leapyear;

    public void init() {
        monthLabel = new Label("Type the month here");
        txF1 = new TextField("", 20);
        txF1.addActionListener(new TextFieldDateInput());
        yearLabel = new Label("Type the year here");
        txF2 = new TextField("", 20);
        txF2.addActionListener(new TextFieldYearInput());

        add(monthLabel);
        add(txF1);
        add(yearLabel);
        add(txF2);

        Months = "";
        totalDays = "";
        year = "2019";
        leapyear = 1;
    }

    public void paint(Graphics g) {
        resize(800, 500);
        g.drawString("Maand: " + Months + ". Aantal dagen in dat maand is: " + totalDays + ". Jaar is: " + year, 100,
                100);
        g.drawString("druk op beide op enter, anders kan er foute resultaat uitkomen", 100, 300);
    }

    private class TextFieldYearInput implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            year = txF2.getText();
            leapyear = Integer.parseInt(year) % 4;
            System.out.println(year);
            System.out.println(leapyear);
            repaint();
        }
    }

    private class TextFieldDateInput implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Months = txF1.getText();

            switch (Months) {
                case "januari": {
                    totalDays = "31";
                }
                break;
                case "februari": {
                    if(leapyear == 0) {
                        totalDays = "29";
                    } else {
                        totalDays = "28";
                    }
                }
                break;
                case "maart": {
                    totalDays = "31";
                }
                break;
                case "april": {
                    totalDays = "30";
                }
                break;
                case "mei": {
                    totalDays = "31";
                }
                break;
                case "juni": {
                    totalDays = "30";
                }
                break;
                case "juli": {
                    totalDays = "31";
                }
                break;
                case "augustus": {
                    totalDays = "31";
                }
                break;
                case "september": {
                    totalDays = "30";
                }
                break;
                case "oktober": {
                    totalDays = "31";
                }
                break;
                case "november": {
                    totalDays = "30";
                }
                break;
                case "december": {
                    totalDays = "31";
                }
                break;
                default:
                    txF1.setText("no month found");
            }

            repaint();

        }
    }
}
