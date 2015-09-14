package chapter_7;

/**
 * pg. 271
 * Created by Rick on 8/14/2015.
 * Demonstrates the various methods in java.util.Arrays
 */
import java.util.Arrays;
public class BuiltInArrayMethods {
    public static void main(String[] args) {

        /**
         * Sort() and parallelSort()
         *
         * Invoking sort(numbers) sorts the whole array.
         * Invoking parallelSort(chars, 1, 3) sorts a partial array from chars[1] to chars[3-1]
         * Note that parallelSort() is more efficient if the computer is using multiple processors.
         * */
        double[] numbers = {6.0,4.4,1.9,2.9,3.4,3.5};
        Arrays.sort(numbers); // Sort the whole array
        System.out.println("numbers sort" + Arrays.toString(numbers));
        Arrays.parallelSort(numbers); // Sort the whole array
        System.out.println("numbers parallel sort" + Arrays.toString(numbers));

        System.out.println();

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars, 1, 3); // Sort part of the array
        System.out.println("chars sort: " + Arrays.toString(chars));
        Arrays.parallelSort(chars, 1, 5);
        System.out.println("chars parallel sort: " + Arrays.toString(chars));

        System.out.println();

        /**
         * binarySearch()
         *
         * To search for a key in an array so long as the array is sorted.
         * If the key is not in the array, the method returns  -(insertionIndex + 1)
         * */
        int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        System.out.println("1. Index is " + Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " + Arrays.binarySearch(list, 12));

        char[] characters = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " + Arrays.binarySearch(characters, 'a'));
        System.out.println("4. Index is " + Arrays.binarySearch(characters, 't'));

        System.out.println();

        /**
         * equals()
         *
         * To check whether two arrays are strictly equal. ie, their corresponding elements are the same.
         * */
        int[] list1 = {2,4,7,10};
        int[] list2 = {2,4,7,10};
        int[] list3 = {4,2,7,10};
        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false

        System.out.println();

        /**
         * fill()
         *
         * To fill in all or part of the array.
         * The following code fills list4 with 5 and fills 8 into elements list5[1] and list5[5-1]
         * */
        int[] list4 = {2,4,7,10};
        int[] list5 = {2,4,7,7,7,10};
        Arrays.fill(list4, 5); // Fill 5 to the whole array
        Arrays.fill(list5, 1, 5, 8); // Fill 8 to a partial array
        System.out.println("list4: " + Arrays.toString(list4));
        System.out.println("list5: " + Arrays.toString(list5));

    }
}
