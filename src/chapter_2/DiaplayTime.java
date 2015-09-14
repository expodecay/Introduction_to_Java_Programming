package chapter_2;

/**
 * pg. 47
 * Created by Rick on 6/24/2015.
 */
import java.util.Scanner;
public class DiaplayTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter an integet for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; //  Seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
