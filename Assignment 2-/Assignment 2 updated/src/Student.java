public class Student {

    // For students, gather the student’s name, assignment1 mark, and assignment2 mark.
    //Validate the student mark that should be greater than or equal 0.0 and less than or equal 20.0******NOTE

    //Define my objects
    public String studentName;
    public double assignmentOne;
    public double assignmentTwo;

    //Define my constructors
    public Student(String studentName, Double assignmentOne, Double assignmentTwo) {
        this.studentName = studentName;
        this.assignmentOne = assignmentOne;
        this.assignmentTwo = assignmentTwo;
    }

    //Method for the total
    public double  stTotal() {
        return (this.assignmentOne + this.assignmentTwo);
    }

    //method for the student report
    public String stReport() {
        return this.studentName + ": Assignment1 - " + this.assignmentOne+ " Assignment2 - " + this.assignmentTwo+ " Total - "
                + this.stTotal();
    }


}
