package Tracked;

import java.awt.*;
import java.util.ArrayList;

public class Drone extends Identifier {

    //Fields
    private int Radiofreq;

    //Constructor
    public Drone(String name, int GPStagID, int Radiofreq, Point position) {
        super(name, GPStagID, position);
        this.Radiofreq = Radiofreq;
    }

    //Methods
    public int getRadiofreq() {
        return Radiofreq;
    }

    @Override                       //Formatting presentation for radiofrequency
    public String toString() {
        return String.format("%dMHz");
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(position.x, position.y, 3, 3);
    }
}