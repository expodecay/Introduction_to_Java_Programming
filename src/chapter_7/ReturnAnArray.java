package chapter_7;
/**
 * pg. 260
 * Created by Rick on 8/12/2015.
 * This method takes as a parameter an array, reverses for order of the contents of the array, then returns the new array.
 */
import java.util.Arrays;
public class ReturnAnArray {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6};
        int[] list2 = reverse(list1);
        System.out.println("list1: " + Arrays.toString(list1));
        System.out.println("list2: " + Arrays.toString( list2));

    }

    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
