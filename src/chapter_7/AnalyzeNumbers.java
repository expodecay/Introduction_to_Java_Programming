package chapter_7;

/**
 * pg. 253
 * Created by Rick on 8/7/2015.
 * The program asks the user for how many numbers to be entered. After they are entered, the program calculates the
 * average of them, then calculates how many of those numbers are larger than the average.
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); // Create a scanner
        System.out.print("Enter the number of items: ");// Prompt the user for the array size
        int n = input.nextInt();
        double[] numbers = new double[n]; // Create a list
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble(); // Take user input and shove into a list
            sum += numbers[i];               // Add the elements of the list
        }

        double average = sum / n;

        int count = 0; // The number of elements above average
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average)
                count++;
        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
