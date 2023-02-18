public class Student {

    //Create objects/Attributes
    public String firstName;
    public String stNumber;
    public boolean isFullTime;
    public Double oopCourse;
    public Double pythonCourse;

    //Constructor
//    public Student(String pFirstName, String pStNumber, Boolean pIsFullTime, Double pOpCourse){
//        this.firstName = pFirstName;
//        this.stNumber = pStNumber;
//        this.isFullTime = pIsFullTime;
//        this.oopCourse = pOpCourse;
//    }

    public Student (String pFirstName, String pStNumber, boolean pIsFullTime, double pOpCourse, double pPythonCourse){
        this.firstName = pFirstName;
        this.stNumber = pStNumber;
        this.isFullTime = pIsFullTime;
        this.oopCourse = pOpCourse;
        this.pythonCourse = pPythonCourse;
    }


    //Method
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
        return (this.pythonCourse+this.oopCourse) / 2;
    }































}
