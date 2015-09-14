package chapter_6;

/**
 * pg. 212
 * Created by Rick on 7/12/2015.
 * Demonstrates how a variable is not changed regardless of the changes made to the parameter inside the method.
 */
public class Increment {
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After teh call, x is " + x);
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}
