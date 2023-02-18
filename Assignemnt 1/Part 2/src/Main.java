import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        //print the welcome message
        System.out.println("Welcome to the second part!");

        //Generate an array with double datatype and give a size of 10
        double[] gradesArray = new double[10];

        System.out.println("Enter the student marks: ");

        //Write for loop to ask the user to enter the 10 grades
        for (int i=0 ; i<gradesArray.length ; i++){
            System.out.println("Enter grade # "+ (i+1)+": ");
            gradesArray[i] = sc.nextDouble();
            sum += gradesArray[i];                 //SUM
            max = Math.max(max, gradesArray[i]);   //MAX
            min = Math.min(min, gradesArray[i]);   //MIN
        }

        System.out.println("Final Report:");

        //Find the sum of all
        System.out.println("The Total Marks: "+ sum);

        //find the average
        System.out.println("The Average: "+sum / gradesArray.length);

        //print the maximum value
        System.out.println("The Maximum Value: "+max);

        //print the minimum value
        System.out.println("The Minimum Value: "+min);

    }
}

