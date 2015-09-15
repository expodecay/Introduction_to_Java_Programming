package chapter_9;

/**
 * pg. 348
 * Created by Rick on 8/20/2015.
 * Demonstrates the difference between passing a primitive type value and passing a reference value. The program passes
 * a circleWithPrivateDataFields object myCircle and an integer value from n to invoke printAreas(myCircle, n)
 */
public class TestPassObject {
    /** Main method */
    public static void main(String[] args) {
        // Create a Circle object with radius 1
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);

        // See myCircle.radius amd times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    /** Print a table of areas for radius */
    public static void printAreas(CircleWithPrivateDataFields c, int times){
        System.out.println("Radius \t\t\tArea");
        while (times >= 1){
            System.out.println(c.getRadius() + "\t\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
