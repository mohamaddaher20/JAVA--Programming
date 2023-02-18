import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare array of object
        Student[] itProgrammerGroup = new Student[3];

        String stName;
        String stWNumber;
        boolean stEnrollment;
        double stOopGrade;
        double stPython;

        System.out.println("Enter the student's information");
        for (int i=0; i< itProgrammerGroup.length; i++){
            System.out.println("Input student name # "+ (i+1)); //(i+1) so it will not start at 0
            stName = sc.nextLine();
            System.out.println("Input student W number #:"+ (i+1));
            stWNumber = sc.nextLine();
            System.out.println("Input student enrollment #:"+ (i+1));
            stEnrollment = sc.nextBoolean();
            System.out.println("Input student opp course #"+ (i+1));
            stOopGrade = sc.nextDouble();
            System.out.println("Input student python mark #:"+ (i+1));
            stPython = sc.nextDouble();

            sc.nextLine();

            //we are passing the local variables to the constructor parameter
            itProgrammerGroup[i] = new Student(stName,stWNumber,stEnrollment,stOopGrade,stPython);
        }

        System.out.println("=".repeat(100));

        System.out.println("My final report");

        for (int i = 0; i < itProgrammerGroup.length; i++) {
            System.out.println(itProgrammerGroup[i].stReport());

        }










    }
}