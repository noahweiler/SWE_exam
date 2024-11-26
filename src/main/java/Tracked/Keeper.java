package Tracked;

import java.awt.*;

public class Keeper extends Identifier{

    //Fields
    private int phonenumb;

    public Keeper(String name, int GPStagID, int phonenumb, Point position){
        super(name, GPStagID, position);
        this.phonenumb = phonenumb;
    }

    //Methods
    public int getPhonenumb(){
        return phonenumb;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(position.x, position.y, 4,4);        //diameter is 4

    }

}
