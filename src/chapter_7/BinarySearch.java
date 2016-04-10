package chapter_7;

/**
 * pg. 268
 * Created by Rick on 8/14/2015.
 * The binary search returns index of the search key if it is contained in the list. Otherwise, it returns -low - 1.
 * If we were to replace (high > = low) with (high > low), we would miss a possible matching element. For example,
 * consider a list with just one element. The search would miss that element.
 */
public class BinarySearch {
    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;
        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else {
                low = mid + 1;
            }
        }
        return -low - 1; // Now high < low, key not found
                        // Returns the index where the missing element would be located
    }

    public static void main(String[] args) {
        int[] list = {0,10,20,30,40,50,60,70,80,90};
        int n = 60;
        int bin = binarySearch(list, n);
        System.out.println("Location of " + n + ":  " + "index " + bin);
    }
}
/**
 * Notice that we are using int for everything. If the list = {1,2} and we're looking for the location of 2. Then,
 *      low = 0  and  high = 1
 *      mid = (low + high) / 2 = 0.5  -> 0  (because it's going to force int)
 *
 *  (2 > 1), so (key < list[mid])  and  (key == list[mid]) are False
 *      low = mid + 1 = 0 + 1 = 1
 *
 *  Now low = 1  and high = 1  and the while loop is still True
 *      mid = (low + high) / 2 = 1
 *
 *  (2 == 2), so so (key == list[mid]) is True
 *
 *  And the index of the key is returned.
 * */