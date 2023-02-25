import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise - Disk are Loading..");
        System.out.println('\n');

        //declare the array list
        ArrayList<Circle> circles = new ArrayList<>();

        //add the three circles to the array
        circles.add(new Circle());
        circles.add(new Circle(3.0));
        circles.add(new Circle(4.0,"Red"));

        //for each loop to print the circles methods
        for(Circle myCircles: circles) {
            System.out.println(myCircles.toString());
            System.out.println(myCircles.getArea());
            System.out.println('\n');
        }










    }
}