package chapter_9;

/**
 * pg. 346
 * Created by Rick on 8/18/2015.
 */
public class TestCircleWithPrivateDataFields {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with radius 5.0
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
/*
* The data field radius is declared private. Private data can be accessed only within their defining class, so you
* cannot use myCircle.radius in the client program
*
* The static variable is declared private and so cannot be modified directly.
* */