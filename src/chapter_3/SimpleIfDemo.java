package chapter_3;

/**
 * pg. 79
 * Created by Rick on 6/30/2015.
 * This program prompt the user to enter an integer. If the integer is a multiple of 5, the program displays
 * HIFIVE. If the number is divisible by 2, the program displays HIEVEN.
 */
import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integet: ");
        int number = input.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}
