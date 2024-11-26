import Tracked.Drone;
import Tracked.Keeper;
import Tracked.Lion;

import java.awt.*;
import java.io.IOException;

import static java.lang.Math.sqrt;

public class Distance{

//    Point pos_keeper = LocationSystem.getCoords(80);
//    Point pos_lion = LocationSystem.getCoords(30);
//    Point pos_drone = LocationSystem.getCoords(124);

    //Fields
    private Point pos_keeper;
    private Point pos_lion;
    private int GPSIDLion;
    private int GPSIDKeeper;



    public Distance(Point pos_keeper, Point pos_lion, int GPSIDLion, int GPSIDKeeper) throws IOException {
        this.pos_keeper = LocationSystem.getCoords(GPSIDKeeper);
        this.pos_lion = LocationSystem.getCoords(GPSIDLion);
    }

    //Methods

    public int x_distance(Point pos_keeper, Point pos_lion) {
        return Math.abs(pos_keeper.x - pos_lion.x);
    }

    public int y_distance(Point pos_keeper, Point pos_lion) {
        return Math.abs(pos_keeper.y - pos_lion.y);
    }

    public int total_distance(Point pos_keeper, Point pos_lion) {
        return sqrt()
    }
}
