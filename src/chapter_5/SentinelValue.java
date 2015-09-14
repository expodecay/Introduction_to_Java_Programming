package chapter_5;

/**
 * pg. 166
 * Created by Rick on 7/23/2015.
 * Demonstrates how to break a loop with a sentinel value. An input of 0 indicates the end of the loop.
 * Note: Do not use floating point value for equality checking in loop control
 */
import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer ( the program ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;
            System.out.print("Enter an integer (hte program ends if it is 0: ");
            data = input.nextInt();
        }

        System.out.print("The sum is " + sum);
    }
}
