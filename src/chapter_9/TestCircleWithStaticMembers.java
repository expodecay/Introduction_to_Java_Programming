package chapter_9;

/**
 * pg. 339
 * Created by Rick on 8/17/2015.
 * Note that if you compile this program, CircleWithStaticMembers.java will automatically compile it.
 * Also, c1.numberOfObjects can be replaced with CircleWithStaticMembers.numberOfObjects
 *      or CircleWithStaticMembers.getNumberOfObjects().
 */
public class TestCircleWithStaticMembers {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);

        // Create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        // Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1 ");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

        // Create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers();

        // Modify instance variable (radius) of c1
        c1.radius = 9;

        // Display c1 and c1 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
