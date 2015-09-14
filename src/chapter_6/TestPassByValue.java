package chapter_6;

/**
 * pg. 213
 * Created by Rick on 7/12/2015.
 * This program creates a method for swapping two variables. The swap method is invoked by passing two arguments.
 * Note that the values of the arguments are not changed after the method is invoked. The values of the arguments num1
 * and num2 are passed to n1 and n2, but n1 and 2n have their own memory locations independent of num1 and num2. Therefore
 * changes in n1 and n2 do not affect the contents of num1 and num2.
 */
public class TestPassByValue {
    /** Main method*/
    public static void main(String[] args){
        // Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

        // Invoke the swap method to attempt to swap two variables
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }
    /** Swap two variables */
    public static void swap(int n1, int n2){
        System.out.println("\tInside teh swap method"); // Note the use of the tab character
        System.out.println("\t\tBefore the swapping, n1 is " + n1 + " and n2 is " + n2);

        // Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}
/** Another twist is to change the parameter name n1 in swap to num1. What effect does this have? No change occurs,
 * because it makes no difference whether the parameter and the argument have the same name. The parameter is a
 * variable in the method with its own memory space.The variable is allocated when the method is invoked, and it
 * disappears when the method is returned to its caller.
 */