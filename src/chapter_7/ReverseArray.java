package chapter_7;

import java.util.Arrays;

/**
 * See pg. 260
 * Two approaches to reversing a list. Result1() uses an interesting argument in it's for loop.
 * Also notice that the new lists are constructed in the calling method (not in main()).
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6,7,8,9};
        int[] list2 = reverse1(list1);

        System.out.println("List1: " + Arrays.toString(list1)+"\n");
        System.out.println(Arrays.toString(list2));

        int[] list3 = {1,2,3,4,5,6,7,8,9};
        int[] list4 = reverse2(list3);
        System.out.println(Arrays.toString(list4));

    }
    // Book version
    public static int[] reverse1(int[] list){
        int[] result = new int[list.length];
        for (int i = 0, j = result.length-1; i<list.length; i++, j--){  // Multiple indices used in same loop.
            result[j] = list[i];
        }
        return result;
    }

    // My version
    public static int[] reverse2(int[] list){
        int[] result = new int[list.length];
        for(int i =0; i<list.length; i++){
            for (int j = list.length-1; j>=0; j--){
                result[j] = list[i];
                i++;                      // Must be incremented at this point. (The i loop will terminate on its own.)
            }


        }
        return result;
    }
}
