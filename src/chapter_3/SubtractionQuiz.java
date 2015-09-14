package chapter_3;

/**
 * pg. 87
 * Created by Rick on 7/8/2015.
 * This program demonstrates RANDOM NUMBER GENERATION.
 * This program generates two random numbers to be subtracted, and the user is asked what the answer is. If the
 * second number is larger than the first, their order is switched.
 *
 * random() method is in the Math class. It returns a number d such that 0 <= d <= 0.1
 * Thus (int)(Math.random()*10) returns a number between 0 and 9.
 */
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        // Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // if number1 < number2, swap them
        if (number1 < number2){
            int temp = number1; // temp is used to hold number1
            number1 = number2; // number2 takes the former place of number1
            number2 = temp;
        }
        // Prompt the user to answer the question
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // Grade the answer
        if (number1 - number2 == answer)
            System.out.println("You are currect!");
        else{
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 +" should be " + (number1 - number2));
        }
    }
}
