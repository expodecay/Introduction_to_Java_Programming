package chapter_18;

/**
 * Created by Rick on 4/7/2016.
 *
 * pg. 716
 * Note, for this to work, the list must be sorted in increasing order. First compares the key with the middle, halves
 * the list and continues recursively.
 */
public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] list, int key){
        int low = 0;
        int high = list.length-1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high){
        if (low > high)
            return -low - 1; // List exhausted without a match.

        int mid = (low + high)/2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid-1); // continue on left half
        else if (key == list[mid])
            return mid;  // return value
        else
            return recursiveBinarySearch(list, key, mid+1, high);  // continue on right half
    }
    public static void main(String[] args) {
        int[] list = {0,10,20,30,40,50,60,70,80,90};
        int n = 60;
        int bin = recursiveBinarySearch(list, n);
        System.out.println("Location of " + n + ":  " + "index " + bin);
    }
}
