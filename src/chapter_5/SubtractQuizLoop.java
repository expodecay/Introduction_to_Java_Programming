package chapter_5;

/**
 * pg. 164
 * Created by Rick on 7/23/2015.
 * SubtractionQuiz from chapter 3 generated one question at a time. This program generates 5, and prints the
 * time to complete the quiz
 */
import java.util.Scanner;

public class SubtractQuizLoop {
    public static void main(String[] args){
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS){
            // Generate two random single-digit integers
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            // if nu1 < num2, swap them
            if (num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            // Prompt the user to answer the question
            System.out.print("What is " + num1 + " - " + num2 + "? ");
            int answer = input.nextInt();

            // Grade the answer and display result
            if (num1 - num2 == answer){
                System.out.println("You are correct");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + num1 + " - " + num2 + " should be " +(num1 - num2));

            count++; // Increase the question count

            output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " correct": " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
