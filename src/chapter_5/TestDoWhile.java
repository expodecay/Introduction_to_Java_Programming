package chapter_5;

/**
 * pg. 169
 * Created by Rick on 7/24/2015.
 * Demonstrates a do-while loop. The program works the same as SentinelValue.
 * The difference between a while loop and a do-while loop is the order in which the LOOP-CONTINUATION-CONDITION is
 *      evaluated.
 */
import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args){
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do{
            // Read the next data
            System.out.print("Enter an integer (the  input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        }while (data != 0);
        System.out.println("The sum is " + sum);
    }
}
