package NSCC;
public class Student {

    //define properties
    public String firstName;
    public String stNumber;
    public boolean isFullTime;
    public double oppCourse;
    public double pythonCourse;

    //Create a static property. A static property is a property that is related to the class itself
    // It is not considered an object property.
    //you cant use this property under the object name. You have to used under the class name.
    public static int stdCount;

    //Constructor Section
    public Student(String pFirstName, String pStNumber, Boolean pIsFullTime, Double pOpCourse, double pPythonCourse){
        this.firstName = pFirstName;
        this.stNumber = pStNumber;
        this.isFullTime = pIsFullTime;
        this.oppCourse = pOpCourse;
        this.pythonCourse = pPythonCourse;
        stdCount++;
    }

    //Method Section
    public String stReport() {
        return this.firstName + "The student average is:"+this.stAverage();
    }

    public String toString() {
        String enrol = "Part Time";
        if (this.isFullTime) {
            enrol = "Full Time";
        }
        return this.firstName+" is "+ enrol;
    }

    public double stAverage() {
        return (this.pythonCourse+this.oppCourse)/2;
    }

    //A static method. ASSIGNMENT 2 ***************
    public static void printLine(){
        System.out.println("=".repeat(100));


    }
}
