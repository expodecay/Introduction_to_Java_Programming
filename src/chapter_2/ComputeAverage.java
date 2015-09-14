package chapter_2;

/**
 * pg. 38
 * Created by Rick on 6/23/2015.
 */
// Computes the average of three numbers provided by the user.
import java.util.Scanner;

public class ComputeAverage
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3) / 3;

        // Display the results
        System.out.println("The average of " + number1 + " " + number2
        + " " + number3 + " is " + average);
    }
}
