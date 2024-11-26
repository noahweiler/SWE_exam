package Tracked;

import java.awt.*;

public abstract class Identifier implements Tracked.Drawable{

    //Fields
    protected String name;
    protected int GPStagID;
    protected Point position;

    public Identifier(String name, int GPStagID, Point position) {
        this.name = name;
        this.GPStagID = GPStagID;
        this.position = position;
    }

    //Methods
    public String getName() {
        return name;
    }

    public int getGPStagID() {
        return GPStagID;
    }

}
