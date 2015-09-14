package chapter_2;

/**
 * pg. 61
 * Created by Rick on 6/27/2015.
 * This program computes loan payments. The user enters the interest rate, loan amount, and the number of years for
 * which the payments will be made. It will then compute and display the monthly payment and total payment amounts.
 */
import java.util.Scanner;

public class ComputeLoan
{
    public static void main(String[] args)
    {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate
        System.out.print("Enter annual interest rate, e.g., 7.25: ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years
        System.out.print("Enter the number of years as an integet, e.g., 5: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        // Calculate payment (Given in the textbook)
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1/ Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display results using "casting" to produce two decimal places
        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
    }
}
