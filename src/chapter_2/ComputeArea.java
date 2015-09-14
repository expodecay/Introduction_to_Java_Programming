package chapter_2;

/**
 * pg. 43
 * Created by Rick on 6/23/2015.
 */
// Calculates the area of a circle.
import java.util.Scanner; // import class ... Scanner is in the java.util package
public class ComputeArea
{
    public static void main(String[] args)
    {
        final double PI = 3.14159; // Declare a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble(); //This reads from the input from the keyboard

        // Compute area
        double area = radius * radius * PI;

        // display the results
        System.out.print("The area for the circle of radius " + radius
        + " is " + area);
    }
}
