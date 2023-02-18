public class House {

    //Define the properties
    public int length;
    public int width;
    public int numOfRooms;
    public int numOfBathrooms;

    //Parametrized constructor (with parameter)
    public House(int length, int width, int numOfRooms, int numOfBathrooms) {
        this.length = length;
        this.width = width;
        this.numOfRooms = numOfRooms;
        this.numOfBathrooms = numOfBathrooms;
    }


    //method to print total area
    public void printTotalArea() {
        int totalArea = length * width;
        System.out.println("Total area of the house: " + totalArea + " sqft");
    }


    public void describeHouse() {
        System.out.println("The house has " + numOfRooms + " rooms and " + numOfBathrooms + " bathrooms");
    }

}














