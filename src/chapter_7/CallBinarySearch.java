package chapter_7;

/**
 * Created by Rick on 8/14/2015.
 */
public class CallBinarySearch {
    public static void main(String[] args) {

        int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        int[] list1 = {1,2};
        int i = BinarySearch.binarySearch(list, 2);
        int j = BinarySearch.binarySearch(list, 11);
        int k = BinarySearch.binarySearch(list, 13);
        int l = BinarySearch.binarySearch(list, 1);
        int m = BinarySearch.binarySearch(list, 3);
        System.out.println("i: " + i + "\nj: " + j + "\nk: " + k + "\nl: " + l + "\nm: " + m);


        int p = BinarySearch.binarySearch(list1, 2);
        System.out.println("p: " + p);
    }
}
