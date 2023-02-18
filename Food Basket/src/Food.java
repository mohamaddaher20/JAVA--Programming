public class Food {

    //Define properties/Attributes
    public String name;
    public String type;

    //Constructor with parameter
    public Food(String pName, String pType) {
        this.name = pName;
        this.type = pType;
    }

    //Method 1 eatIt()
    public String eatIt() {
        return "You just ate the " + this.name;
    }

    //Method 2 denyIt()
    public String denyIt() {
        return "Not eating that! I hate " + this.type;
    }

}



