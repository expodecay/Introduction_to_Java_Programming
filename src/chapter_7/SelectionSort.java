package chapter_7;

/**
 * pg. 270
 * Created by Rick on 8/14/2015.
 * This program sorts an array of double elements by finding the smallest item in the list and placing it at list[0].
 * Then the next smallest item is found and placed at list[1] etc...
 *
 * The for loop with the index i finds the smallest element and exchanges it with list[i].
 */
public class SelectionSort {
    /** Method for sorting the numbers */
    public static double[] selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++){
            // Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];    // Move along list calling left unsorted element currentMin
            int currentMinIndex = i;

            // Find the smallest item in the list
            for (int j = i + 1; j < list.length; j++){  // Check each element to the right with the "currentMin"
                if (currentMin > list[j]){             // If something smaller is found
                    currentMin = list[j];              // call it the currentMin
                    currentMinIndex = j;               // keep track of its location and keep checking the next elements.
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){                  // If the currentMin is not located at left most unsorted position.
                list[currentMinIndex] = list[i];        // swap them
                list[i] = currentMin;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        double[] list1 = {1,9,4.5,6.6,5.7,-4.5};
        System.out.println("list1: " + java.util.Arrays.toString(list1));
        double[] list2 = SelectionSort.selectionSort(list1);
        System.out.println("list: " + java.util.Arrays.toString(list2));

        System.out.println(java.util.Arrays.toString(SelectionSort.selectionSort(list2)));
        System.out.println(java.util.Arrays.toString(list2));

    }
}
