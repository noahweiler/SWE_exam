package Tracked;
import Tracked.Keeper;
import Tracked.Lion;
import Tracked.Drone;
import Tracked.Identifier;
import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.ArrayList;

public class DrawingIdentifiers extends Canvas {

    //Fields
    private Lion lion;
    private Keeper keeper;
    private Drone drone;
    private ArrayList<Identifier> shapes = new ArrayList<>();


    //Constructor
    public DrawingIdentifiers(Lion l, Keeper k, Drone d) {
        this.lion = l;
        this.keeper = k;
        this.drone = d;
        shapes.add(l);
        shapes.add(k);
        shapes.add(d);
    }
    @Override
    public void paint(Graphics g) {                 //Method automatically called when put on canvas
        for (Identifier i : shapes) {
            i.draw(g);
        }
    }
}

