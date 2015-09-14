package chapter_7;

/**
 * pg. 266
 * Created by Rick on 8/14/2015.
 * On average, a linear search will have to examine half of the elements in an array before finding the key, if it exists.
 * The elements can be in any order, but since the execution of time of a linear search increases linearly as the number
 * of array elements increases, linear search is inefficient for a large array.
 */
public class LinearSearch {
    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key){
        for (int i =0; i < list.length; i++){
            if (key == list[i])
                return i; // If the key matches an element in the array, the index is returned
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,4,4,2,5,-3,6,2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);
        System.out.print("i: " + i + "\nj: " +  j + "\nk: "  + k);
    }
}
