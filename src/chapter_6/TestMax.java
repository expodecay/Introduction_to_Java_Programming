package chapter_6;

/**
 * pg. 206
 * Created by Rick on 7/11/2015.
 * This program demonstrates how to define and invoke a method.
 */
public class TestMax {
    /** Main method */
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int k = max(i, j); // Invoke the max() method.
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    /** Return the max of the two values*/
    public static int max(int num1, int num2){ // The max method actually RETURNS a value so we don't use "void"
        int result;

        if (num1 > num2)
                result = num1;
        else
            result = num2;

        return result;
    }
}
