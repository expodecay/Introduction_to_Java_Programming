package chapter_18;

/**
 * Created by Rick on 4/7/2016.
 *
 * pg. 715
 * See SelectionSort.java from chapter 7 for the non-recursive version.
 */
public class RecursiveSelectionSort {

    public static void sort(double[] list){
        sort(list, 0, list.length-1); // Sort the entire list
    }

    private static void sort(double[] list, int low, int high){ // Return void (we're altering an existing list)
        if (low < high){

            // Find the smallest number and its index in list[low...high]
            int indexOfMin = low;
            double min = list[low];
            for (int i = low +1; i <= high; i++){
                if (list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }
            // Swap the smallest in list[low...high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sort the remaining list[low + 1 ... high
            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        double[] list = {5,6,4,8,7,1,2,3,9,46};
         sort(list);
        System.out.println(java.util.Arrays.toString(list));
    }
}
