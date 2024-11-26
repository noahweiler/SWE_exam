import Tracked.DrawingIdentifiers;
import Tracked.Drone;
import Tracked.Keeper;
import Tracked.Lion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.TimerTask;

public class Park extends Canvas {

    static GraphicsConfiguration gc;

    public Park() throws IOException {

        //Creating frame to put park on
        //Add canvas to map to draw figures on it, make background transparent

        //Creating frame
        JFrame frame = new JFrame("Park", gc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        //Creating iteration loop that refreshes every second

        //LOOP THAT REFRESHES EVERY SECOND START
        try {
            Thread.sleep(1000);

            //Creating objects to be painted on Canvas
            Point pos_keeper = LocationSystem.getCoords(80);
            Point pos_lion = LocationSystem.getCoords(30);
            Point pos_drone = LocationSystem.getCoords(124);

            Keeper keeper = new Keeper("Geoff",80,4392,pos_keeper);
            Lion lion = new Lion("Simba",30,7,pos_lion);
            Drone drone = new Drone("Monitor1",124,128,pos_drone);

            DrawingIdentifiers drawing = new DrawingIdentifiers(lion,keeper,drone);

            //Creating a custom canvas
            Canvas canvas = new Canvas() {                                   //Creating new anonymous class which inherits from canvas and overrides its paint method
                @Override   //Overriding paint method in canvas
                public void paint(Graphics g) {                             //DO NOT NEED TO EXPLICITLY CALL THIS METHOD, ITS SPECIAL AND IS CALLED AUTOMATICALLY WHEN USING AWT/SWING IN JAVA. IT IS DONE UNDER CERTAIN CONDITIONS LIKE WHEN THE CANVAS IS BEING DISPLAYED AT FIRST
                    setBackground(Color.WHITE);
                    //Drawing shapes on transparent canvas
                    drawing.paint(g);
                }
            };

            canvas.setPreferredSize(new Dimension(600, 600));
            frame.add(canvas, BorderLayout.CENTER);

            frame.setVisible(true);
            }
        catch(Exception e){
        }
        //LOOP THAT REFRESHES EVERY SECOND END


    }
}