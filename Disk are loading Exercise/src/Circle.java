public class Circle {

    //Two private properties
    private double radius;
    private String color;

    //Default constructors
    public Circle() {
        this.radius=2.0;
        this.color= "Green";
    }

    //Add a second overloaded constructor to control the size
    public Circle(double radius){
        this.radius= radius;
    }

    //Add a third constructor to control size or color
    public Circle(double radius, String color){
        this.radius= radius;
        this.color= color;
    }

    //Add getter method for the two properties
    public double getRadius(){
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    //Add getArea method
    public String getArea() {
        return "The are of the circle is: "+ Math.PI*(this.radius * this.radius);
    }

    //Add toString method
    public String toString() {
        return "Radius= "+ this.radius +" Color= "+ this.color;
    }






}
