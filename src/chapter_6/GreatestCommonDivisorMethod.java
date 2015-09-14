package chapter_6;

/**
 * pg. 215
 * Created by Rick on 7/15/2015.
 * This program demonstrates Modularizing code
 * This makes the code easy to maintain and debug, and enables the code to be reused
 */
import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    /** Main method */
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Call gcd() and print with results
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }


    /** Return the gcd of two integers */
    public static int gcd(int n1, int n2){
        int gcd = 1; //  Initialize gcd to 1 (without this initialization, return gcd will cause an error)
        int k = 2; // Possible gcd

        while(k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }
}/**
By encapsulating the code into separate methods, the errors on computing the gcd are confined in the gcd() method,
 which narrows the scope of debugging. This also allows gcd() to be reused in other programs
*/
