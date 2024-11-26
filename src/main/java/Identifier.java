public class Identifier {

    //Fields
    protected String name;
    protected int GPStagID;

    public Identifier(String name, int GPStagID) {
        this.name = name;
        this.GPStagID = GPStagID;
    }

    //Methods
    public String getName() {
        return name;
    }

    public int getGPStagID() {
        return GPStagID;
    }

}
