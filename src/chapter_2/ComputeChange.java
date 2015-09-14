package chapter_2;

/**
 * pg. 63
 * Created by Rick on 6/28/2015.
 * This program takes the amount of dollars provided by the user and outputs a report listing the monetary equivalent
 * in the maximum number of dollars, quarters, dimes, nickles, and pennies.
 */
import java.util.Scanner;
public class ComputeChange
{
    public static void main(String[] args)
    {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        // Represent the users dollar (double) amount in cents (integer)
        // 11.56 becomes 1156
        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;        //  The integer division 1156 / 100 gives 11
        remainingAmount = remainingAmount % 100;            // The remainder of 1156 % 100 is 56

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;        // Integer division 56 / 25 gives 2
        remainingAmount = remainingAmount % 25;             // Remainder 56 % 25 gives 6

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;           // Integer division 24 / 10 gives 0
        remainingAmount = remainingAmount % 10;             // Remainder 24 / 10 gives 6

        // Find the number of nickles in the remaining amount
        int numberOfNickles = remainingAmount / 5;          // Integer division 4 /5 gives 1
        remainingAmount = remainingAmount % 5;              // Remainder 4 % 5 gives 1

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount  " + amount + " consists of");
        System.out.println("    " + numberOfDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickles + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
