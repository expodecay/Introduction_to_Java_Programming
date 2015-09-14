package chapter_3;

/**
 * pg. 94
 * Created by Rick on 7/9/2015.
 * This program checks whether a number is divisible by 2 and 3, by 2 or 3, and by 2 or 3 but not both.
 */
import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.print("Enter an integet: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 ==0)
            System.out.println(number + " is divisible by 2 and 3.");

        if (number % 2 == 0 || number % 3 ==0)
            System.out.println(number + " is divisible by 2 or 3.");

        if (number % 2 == 0 ^ number % 3 ==0)
            System.out.println(number + " is divisible by 2 or 3, but not both.");
    }
}
