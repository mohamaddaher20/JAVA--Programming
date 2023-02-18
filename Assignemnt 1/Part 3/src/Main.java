import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaring my variables
        double sum = 0;
        int count = 0;
        double average;

        // declare and initialize the two dimensional array
        int[][] myArray = {{10, 20, 30, 40}, {12, 15, 18, 19}, {10, 10, 10, 10}};

        // print the welcome message
        System.out.println("Welcome to the Third Part!");

        // print the original two-dimensional array
        System.out.println("The Array Elements are: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
                sum += myArray[i][j];
                count++;
            }
            System.out.println();
        }

        // calculate and print the total sum of each row in the array
        for (int i = 0; i < myArray.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < myArray[i].length; j++) {
                rowSum += myArray[i][j];
            }
            System.out.println("The summation of Row # " + (i + 1) + " is : " + rowSum);
        }

        // calculate and print the average of all elements in the array
        System.out.println();
        average = sum / count;
        System.out.println("The Average is : " + average);

        System.out.println();

        // convert the two-dimensional array to a one dimensional array
        int[] oneDimArray = new int[count];
        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                oneDimArray[k] = myArray[i][j];
                k++;
            }
        }

        // print the one dimensional array
        System.out.println("The Converted Array Elements are: ");
        for (int i = 0; i < oneDimArray.length; i++) {
            System.out.println(oneDimArray[i]);
        }

        // sort the one dimensional array in ascending order using bubble sort
        for (int i = 0; i < oneDimArray.length - 1; i++) {
            for (int j = 0; j < oneDimArray.length - i - 1; j++) {
                if (oneDimArray[j] > oneDimArray[j + 1]) {
                    int temp = oneDimArray[j];
                    oneDimArray[j] = oneDimArray[j + 1];
                    oneDimArray[j + 1] = temp;
                }
            }
        }
    }
}




