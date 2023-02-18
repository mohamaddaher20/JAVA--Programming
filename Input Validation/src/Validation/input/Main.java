package Validation.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Input an integer number: ");
//        if (sc.hasNextInt()) {
//            int number = sc.nextInt();
//            System.out.println(number);
//        }
//        else {
//            System.out.println("Invalid entry");
//        }

    ////////////////////////////////////////////////////////////////////
    // TRY CATCH
//        System.out.print("Input an integer number: ");
//        try {
//            int number = sc.nextInt();
//            System.out.println(number);
//        }
//        catch (Exception ex) {
//            System.out.println("Invalid number");
//            System.out.println(ex);
//        }
//        System.out.println("Done");
/////////////////////////////////////////////////////////////////////////////////
    //DO WHILE LOOP
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<10);

//        int number;
//        do {
//            System.out.println("Input an integer number: ");
//            number = sc.nextInt();
//            System.out.println(number);
//        }while(number<0);

////////////////////////////////////////////////////////////////////////////////////////
//        //IMPORTANT *******************************************
//        int number;
//        do {
//            System.out.println("Enter a number: ");
//            while(!sc.hasNextInt()){
//                System.out.println("Enter a positive number");
//                sc.next();  //IF I COMMENT THIS LINE IT WILL RUN INFINITE
//            }
//            number = sc.nextInt();  //WHAT WILL HAPPEN IF I COMMENT THIS LINE
//        } while(number < 0);
//        System.out.println(number);

/////////////////////////////////////////////////////////////////////////
        //IMPORTANT *********************************************

//        int number;
//        do {
//            number = 0;
//            try {
//                System.out.println("Enter a number");
//                number = sc.nextInt();
//            }
//            catch (Exception ex) {
//                System.out.println("Invalid entry");
//                sc.next();
//                number = -1;
//            }
//
//        }while (number < 0);
//        System.out.println(number);

///////////////////////////////////////////////////////////////////////////////////
//FOR ASSIGNMENT 2
//        double stMark;
//        do {
//            System.out.println("Enter a student's mark:");
//            while(!sc.hasNextInt()){
//                System.out.println("Enter a double number:");
//                sc.next();
//            }
//            stMark = sc.nextDouble();
//        }while(stMark <0 || stMark > 100);
//        System.out.printf(stMark + " is a valid entry");
//






    }
}