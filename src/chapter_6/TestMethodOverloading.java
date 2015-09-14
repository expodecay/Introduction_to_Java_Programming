package chapter_6;

/**
 * pg. 220
 * Created by Rick on 7/27/2015.
 * Demonstrates Overloading Methods which enables you to define two methods with the same name as long as their
 *      signatures are different.
 * This program creates three methods. The first finds the max integer, the second finds the max double, and the
 *      third finds the max among three double values.
 */
public class TestMethodOverloading {
    public static void main(String[] args) {

        // Invoke max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));

        // Invoke the max method with double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));

        // Invoke the max method with three double parameters
        System.out.println("The maximum value of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    }
        /** Return the max of two int values */
        public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
        }

        /** Return the max of two double values */
        public static double max(double num1, double num2){
            if (num1 > num2)
                return num1;
            else
                return num2;
        }
        /** Return the max of three double values */
        public static double max(double num1, double num2, double num3){
            return max(max(num1, num2), num3);
        }

}
