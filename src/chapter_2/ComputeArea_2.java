package chapter_2;

/**
 * pg. 76
 * Created by Rick on 6/30/2015.
 * This is a modified version of ComputeArea.java
 * The selection statements handle the case of a user entering a negative number for the radius.
 */
import java.util.Scanner; // import class ... Scanner is in the java.util package
public class ComputeArea_2
{
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble(); //This reads from the input from the keyboard

        if (radius < 0) {
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * PI;
            System.out.println("Area is " + area);
        }
    }
}
