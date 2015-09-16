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

        System.out.println("The radius is initially " + myCircle.getRadius() + "\n");

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
/*
* see section 7.6 for details
* When passing an object of the primitive type, the value of the argument is passed. In this case, the value of n(5) is
* passed to times. Inside the printAreas method, the content of times is changed. This does not affect the content of n.
*
* When passing an object of a reference type, the reference of the object is passed. In this case, c contains a
* reference for the object that is also referenced by myCircle. Therefore, changing the properties of the object through
* c inside the printAreas method has the same effect as doing so outside the method through the variable myCircle. Notice
* that both myCircle.getRadius() and c.getRadius() both reference the same object.
*
* The difference here is that in the JVM primitive data types are stored in the stack and objects (references, arrays etc.)
* are stored in the heap. The heap is used for dynamic memory allocation. see pg. 349 for the call stack of this program.
*
* For details on memory allocation, visit: http://www-ee.eng.hawaii.edu/~tep/EE160/Book/chap14/subsection2.1.1.8.html
* */