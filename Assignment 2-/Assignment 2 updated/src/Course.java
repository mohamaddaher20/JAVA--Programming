public class Course {

    //For courses, gather the courses name
    //2 courses python and Java - 6 students in each course (array)

    //Define my objects
    public String courseName;
    public double assignment1;
    public double assignment2;
    public double average;

    //Define my constructors
    public Course(String courseName) {
        this.courseName = courseName;
    }

    //Define my Methods
    //method to calculate the average
    public double average() {
        return (this.assignment1 + assignment2) / 2;
    }

    //use if statement for the course rating based on the average***************************************
    //A – If the average of assignment1 and assignment 2 is greater than or equal 100.
    //B – If the average of assignment1 and assignment 2 is greater than or equal to 70 AND less than 100
    //C – If the average of assignment1 and assignment 2 is greater than or equal 50 AND less than 70
    //F – If the average of assignment1 and assignment 2 is less than 70
    public String courseRating() {
        double average = this.average();
        if (average >= 100){
            return "A";
        }
        else if(average >= 70 && average < 100){
            return "B";
        }
        else if(average >=50 && average <70){
            return "C";
        }
        else{
            return "F";
        }
    }

    //method to print out the stats per course report
    //Java Programming : Assignment1 – 100 Assignment2 – 110 Average - 105  Course Rating: A
    public String courseReport() {
        return this.courseName + ": Assignment1 - " + this.assignment1 + " Assignment2 - " + this.assignment2 + " Average - "
                + this.average() + " Course Rating: "+this.courseRating();
    }

}
