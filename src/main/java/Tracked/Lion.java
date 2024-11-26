package Tracked;

import java.awt.*;

public class Lion extends Identifier {

    //Fields
    private int age;

    //Constructor
    public Lion(String name, int GPStagID, int age, Point position) {
        super(name, GPStagID, position);
        this.age = age;
    }

    //Drawing lion
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(position.x, position.y, 6, 6);

    }
}