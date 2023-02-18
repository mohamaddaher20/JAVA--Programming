package NSCC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] itProgrammerGroup = new Student[3];

        String stName;
        String stWNumber;
        boolean stEnrollment;
        double stOopGrade;
        double stPython;

        //printing the static method. for any static property or method we have to use the class name
        Student.printLine();

        //we cant use an object with class but we can use the static with the class.
        //System.out.println(Student.firstName);  //YOU CANT USE IT
        System.out.println(Student.stdCount);   //YOU CAN USE IT
        //THIS WILL PRINT 0 ITS DEFAULT VALUE

        //we cant associate any new instance with the static property
        Student youssef = new Student("Youssef", "Halifax", true, 77.0, 88);
        Student brad = new Student("Youssef", "Halifax", true, 77.0, 88);
        Student sam = new Student("Youssef", "Halifax", true, 77.0, 88);

        System.out.println(Student.stdCount);
        //its highlight it because java want to access it with the class name not the instances
        System.out.println(youssef.stdCount);
        System.out.println(brad.stdCount);
        System.out.println(sam.stdCount);

    }
}

