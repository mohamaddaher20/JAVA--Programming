import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //I will create a new object of the car class
        //we cant deal with teh car's class we need to deal with the object of the class
        Car yousefsCar = new Car();
        System.out.println(yousefsCar.carsModel);   //default = Null
        System.out.println(yousefsCar.carsColor);   //default = Null
        System.out.println(yousefsCar.carsPrice);   //default = 0.0

        //to change the value of the default object
        yousefsCar.carsModel = "Toyota";
        yousefsCar.carsColor = "Red";
        yousefsCar.carsPrice = 1000.0;
        //instead of repeating just use a method to print all
        System.out.println(yousefsCar.carsModel);
        System.out.println(yousefsCar.carsColor);
        System.out.println(yousefsCar.carsPrice);

        //another new object
        Car davidsCar = new Car();
//        System.out.println(davidsCar.carsModel);
//        System.out.println(davidsCar.carsColor);
//        System.out.println(davidsCar.carsPrice);

        System.out.println("Input David's car information");
        System.out.println("Input cars model: ");
        davidsCar.carsModel = sc.nextLine();
        System.out.println("Input cars color: ");
        davidsCar.carsColor = sc.nextLine();
        System.out.println("Input cars price: ");
        davidsCar.carsPrice = sc.nextDouble();

        //to print davids info from the methods
        davidsCar.carsReport();
        yousefsCar.carsReport();

        //davidsCar.turnRight();  //remember it will not print because we didn't call it
        System.out.println(davidsCar.turnRight());

        //A new third object
        Car GeoffsCar = new Car("Honda", "Blue",4500.0);
        GeoffsCar.carsReport();







    }
}