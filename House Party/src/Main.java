import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create object 1 of the house class
        House house1 = new House(100, 200, 2, 2);
        house1.printTotalArea();
        house1.describeHouse();

        //create object 2 of the house class
        House house2 = new House(1000, 1000, 4, 2);
        house2.printTotalArea();
        house2.describeHouse();

        //create object 3 of the house class
        House house3 = new House(5000, 200, 5, 3);
        house3.printTotalArea();
        house3.describeHouse();

    }
}