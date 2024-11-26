public class Keeper extends Identifier{

    //Fields
    private int phonenumb;

    public Keeper(String name, int GPStagID, int phonenumb){
        super(name, GPStagID);
        this.phonenumb = phonenumb;
    }

    //Methods
    public int getPhonenumb(){
        return phonenumb;
    }

}
