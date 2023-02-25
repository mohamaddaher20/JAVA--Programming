import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaration of local variables
        String stName;
        double assignmentOne;
        double assignmentTwo;

        //print the headers
        System.out.println("Programming IT Courses");
        System.out.println("COURSE ENTRY");
        System.out.println("=".repeat(50));

        //The first course object
        System.out.println("Enter name for course #1: ");
        String course1Name = sc.nextLine();
        Course course1 = new Course(course1Name);

        //The second course object
        System.out.println("Enter name for course #2: ");
        String course2Name = sc.nextLine();
        Course course2 = new Course(course2Name);

        //print the headers
        System.out.println("Student Entry");
        System.out.println("=".repeat(50));

        //The array of objects (6 students)
        Student[] pythonList = new Student[2];
        Student[] javaList = new Student[2];

        //For loop to gather course 1 information for 6 students
        System.out.println("Enter student for "+course1Name);
        for (int i=0 ; i< pythonList.length; i++){
            //Validation for student name
            do {
                System.out.println("Enter name for student #:" + (i + 1));
                stName = sc.nextLine();
            } while (stName.length() < 3);
            //validation for assignment 1
            do{
              System.out.println("Enter Assignment 1 mark for "+stName);
              assignmentOne = sc.nextDouble();
                sc.nextLine();
            }while (assignmentOne < 0.0 || assignmentOne > 20.0);
            //validation for assignment 2
            do{
              System.out.println("Enter Assignment 2 mark for "+stName);
              assignmentTwo = sc.nextDouble();
              sc.nextLine();
            }while (assignmentTwo < 0.0 || assignmentTwo > 20.0);

            pythonList[i] = new Student (stName, assignmentOne, assignmentTwo);
            course1.assignment1 +=assignmentOne;
            course1.assignment2 +=assignmentTwo;
        }

        //Second for loop to gather student information for the second course
        System.out.println("Enter students for " + course2Name);
        for (int i = 0; i < javaList.length; i++) {
            //Validation for student name
            do {
                System.out.println("Enter name for student #" + (i + 1));
                stName = sc.nextLine();
            } while (stName.length() < 3);

            //validation for assignment 1
            do {
                System.out.println("Enter Assignment 1 mark for " + stName);
                assignmentOne = sc.nextDouble();
                sc.nextLine();
            } while (assignmentOne < 0.0 || assignmentOne > 20.0);
            //validation for assignment 2
            do {
                System.out.println("Enter Assignment 2 mark for " + stName);
                assignmentTwo = sc.nextDouble();
                sc.nextLine();
            }while (assignmentTwo < 0.0 || assignmentTwo > 20.0);

            javaList[i] = new Student(stName, assignmentOne, assignmentTwo);
            course2.assignment1 += assignmentOne;
            course2.assignment2 += assignmentTwo;

        }

        System.out.println('\n');
        System.out.println("REPORT: Stats per Course");
        System.out.println("=".repeat(50));

        //call the course report method to print the course report
        System.out.println(course1.courseReport());
        System.out.println(course2.courseReport());

////////////////////////////////////// SECOND REPORT BEGIN /////////////////////////////////////////////////////////////
        System.out.println("REPORT: Stats per student");
        System.out.println("=".repeat(50));

        System.out.println(course1Name);
        for (int i =0; i < pythonList.length; i++){
            System.out.println(pythonList[i].stReport());
        }

        System.out.println(course2Name);
        for (int i =0; i < javaList.length; i++){
            System.out.println(javaList[i].stReport());
        }

    }
}