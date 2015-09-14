package chapter_2;

/**
 * pg. 58
 * Illustrates type casting. The program displays the sales tax with two digits after the decimal point.
 * Created by Rick on 6/27/2015.
 */
import java.util.Scanner;

public class SalesTax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Enter 197.55
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

        System.out.println("");
        System.out.println("tax:  " + tax);
        System.out.println("tax * 100:  " + tax * 100);
        System.out.println("(tax * 100) / 100:  " + (tax * 100) / 100  + "        this is what we WOULD have.");
        // Turn 1185.3 to the integer 1185. After dividing by 100 we are left with two decimal places.
        System.out.println("(int)(tax * 100) / 100.0):  " + (int)(tax * 100) / 100.0);
    }
}
