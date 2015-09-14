package chapter_7;

/**
 * pg. 259
 * Created by Rick on 8/8/2015.
 * The program contains two methods for swapping elements in an array. The first method, named swap, fails to swap two
 * int arguments. The second method named swapFirstTwoInArray , successfully swaps the first two elements in the array argument.
 */
public class TestPassArray {
    public static void main(String[] args) {
        int[] a = {1,2};

        // Swap elements using the swap method
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        swap(a[0], a[1]);

        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        // Swap elements using the swapFirstTwoArray method
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    /** Swap twp variables */
    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /** Swap the first two elements in the array */
    public static void swapFirstTwoInArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
/**
 * The two elements are not swapped using the swap method since in the parameters in the swap method are primitive type.
 * The values a[0] and a[1] are passed to n1 and n2 inside the method. The memory locations for n1 and n2 are independent
 * of the ones for a[0] and a[1]. Therefore, the content of the array are not affected by the call.
 *
 * The parameter in the swapFirstTwoInArray method is an array. The reference of the array is passed to the method. Thus
 * the variable 'a' (outside the method) and 'array' (inside the method) both refer to the same array in the same memory
 * location. Therefore, swapping array[0] and array[1] inside the method is the same as swapping a[0] with a[1].
 * */