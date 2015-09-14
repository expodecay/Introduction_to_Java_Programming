package chapter_7;
/**
 * pg. 246 - 251
 * Created by Rick on 8/4/2015.
 * Demonstrates different ways of generating a single dimensional array.
 * Array declaration:
 *      elementType[] = arrayRefVar[arraySize]
 * Note that java.util.Arrays is imported and that printing requires Arrays.toString(arrayRefVar)
 */
import java.util.Arrays;
public class ArrayGeneration {
    public static void main(String[] args) {

        /**
         * Declare array variable, create array, and assign reference to the variable all at once using the 'new' operator.
         *      elementType[]  arrayRefVar = new elementType[arraySize]
         * */
        double[] list1 = new double[10];
        list1[0] = 1;
        list1[1] = 2;
        list1[2] = 3;
        list1[3] = 4;
        list1[4] = 5;
        list1[5] = 6;
        list1[6] = 7;
        list1[7] = 8;
        list1[8] = 9;
        list1[9] = 10;

        /**
         * Use for loop.
         */
        double[] list2 = new double[10];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = i + 1;
        }

        /**
         * Use array initializer.
         * elementType[] arrayRefVar = {value0, value1, value2 ... valueN}
         */
        double[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("list1: " + Arrays.toString(list1));
        System.out.println("list2: " + Arrays.toString(list2));
        System.out.println("list3: " + Arrays.toString(list3));

        /**
         * Initialize array with input values.
         * */
        double[] list4 = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("\nEnter " + list4.length + " values (One at a time or all separated by spaces): ");
        for (int i = 0; i < list4.length; i++) {
            list4[i] = input.nextDouble();
        }
        System.out.println("list4: " + Arrays.toString(list4));

        /**
         * Initialize array with random values
         * */
        double[] list5 = new double[10];
        for (int i = 0; i < list5.length; i++) {
            list5[i] = Math.random() * 100;
        }
        System.out.println("list5: " + Arrays.toString(list5));

        /**
         * Display arrays.
         * */
        double[] list6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("list6: ");
        for (int i = 0; i < list6.length; i++) {
            System.out.print(list6[i] + " ");
        }

        /************    Some useful array ways of processing arrays    ***********/

        /**
         * Summing all elements
         * */
        double[] list7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double total = 0;
        for (int i = 0; i < list7.length; i++) {
            total += list7[i];
        }
        System.out.println("\nlist7: " + Arrays.toString(list7) + "   total: " + total);

        /**
         * Finding the largest element.
         * The variable max is used to store the largest element. Initially, max is set to list8[0]
         * To find the true max value, compare with each element of the list and update max
         * */
        double[] list8 = new double[10];
        for (int i = 0; i < list8.length; i++) {
            list8[i] = (int) (Math.random() * 10000) / 100;
        }
        double max = list8[0];
        for (int i = 1; i < list8.length; i++) {
            if (list8[i] > max) max = list8[i];
        }
        System.out.println("list8: " + Arrays.toString(list8) + "   max: " + max);


        /**
         * Finding the smallest index of the largest element.
         * Consider the list {1,5,3,4,5,5,5}
         *      Largest element is 5 and the smallest index of occurrence is 1
         * Let max store the largest element.
         * Let indexOfMax denote the index of the largest element.
         * Initially maximum is list9[0] and indexOfMax is 0.
         *      Compare each element in list9 with maximum, and update max and indexOfMax if the element is greater than maximum.
         * */
        double[] list9 = {1, 5, 3, 4, 5, 6, 5, 5, 6};
        double maximum = list9[0];
        int indexOfMax = 0;
        for (int i = 1; i < list9.length; i++) {
            if (list9[i] > maximum) {
                maximum = list9[i];
                indexOfMax = i;
            }
        }
        System.out.println("list9: " + Arrays.toString(list9) + "   Smallest index of largest element: " + indexOfMax);

        /**
         * Random shuffling
         * Completely shuffles the list.
         * */
        double[] list10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = list10.length - 1; i > 0; i--) {
            // Generate an index j randomly with 0 <= j <= i
            int j = (int) (Math.random() * (i + 1));

            // Swap list10[i} with list10[j]
            double temp = list10[i];
            list10[i] = list10[j];
            list10[j] = temp;
        }
        System.out.println("list10: " + Arrays.toString(list10));

        /**
         * Shifting elements
         * Shifts the elements of the list one space to the left.
         * */
        double[] list11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double temp = list11[0]; // Retain the first element

        // Shift elements left
        for (int i = 1; i < list11.length; i++) {
            list11[i - 1] = list11[i];
        }
        // Move the first element to fill in the last position
        list11[list11.length - 1] = temp;
        System.out.println("list11: " + Arrays.toString(list11));

        /**
         * Shit to the right. Notice the indices compared to the left shift.
         * */
        double[] list12 = {1,2,3,4,5,6,7,8,9,10};
        double temps = list12[list12.length - 1];
        for (int i = list12.length - 2; i >= 0; i--) {
            list12[i + 1] = list12[i];
        }
        list12[0] = temps;
        System.out.println("list12: " + Arrays.toString(list12));


        /**********************                Foreach loop                **************************/

        /**
         * Foreach loops enable you to traverse the array sequentially without using an index variable.
         * The code reads "for each element e in list13, do the following."
         * Syntax:
         *      for (elementType element: arrayRefVar){
         *          // Process the element
         *      }
         * */
        double[] list13 = {10,9,8,7,6,5,4,3,2,1};
        System.out.print("list13: ");
        for (double e: list13){
            System.out.print(e + " ");
        }
    }
}