import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Print out the welcome message.
        System.out.println("Welcome to the first Part!");

        //Prompt the user to enter the number of asterisks. Use a data type of integer
        System.out.println("Enter the number of asterisks: ");
        int numberOfAsterisks = sc.nextInt();

        //Here I used a for loop decreasing by one each time till it reaches the end of the user input
        for (int i = numberOfAsterisks; i > 0; i--) {
            for (int j = 0; j < i; j++) {   //Inner loop to print the *
                System.out.print("*");
            }
            //move to the next line
            System.out.println();
        }

        //Here I also used a for loop increasing by one each time.
        for (int i = 0; i < numberOfAsterisks; i++) {
            //inner loop to print the spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //Inner loop to print the *
            for (int k = 0; k < numberOfAsterisks - i; k++) {
                System.out.print("*");
            }
            //move to the next line
            System.out.println();
        }
    }
}






