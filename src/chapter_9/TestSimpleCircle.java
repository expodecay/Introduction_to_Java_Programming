package chapter_9;

/**
 * pg. 324
 * Created by Rick on 8/16/2015.
 * This program defines the circle class and uses it to create objects. The program constructs three circle objects with
 * radii 1, 25, and 125 and displays the radius and area of each. It then changes the second object to 100 and displays
 * its new radius and area.
 */
public class TestSimpleCircle {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with radius 1 (default radius of the SimpleCircle class)
        SimpleCircle  circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}

// Define the circle class with two constructors
class SimpleCircle{                                     // Class
    double radius;                                      // data field

    /** Construct a circle with radius 1 */
    SimpleCircle(){                                     // no-arg constructor
        radius = 1;
    }

    /** Construct a circle with a specific radius */
    SimpleCircle(double newRadius){                     // second constructor
        radius = newRadius;
    }

    /** Return the radius of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }
    /** Return the perimeter of this circle*/
    double getPerimeter(){
        return 2 * radius *Math.PI;
    }
    /** Set a new radius for this circle */
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
/**
 * The relationship between class and object is similar to an apple-pie recipe and an apple-pie. A java class uses
 * variables to define data fields and methods to define actions. A class also provides methods of a special type, known
 * as constructors, which are invoked to create a new object. The constructor can perform any action, but they are
 * designed to perform initialization actions (initializing data fields etc.) So, new Circle() creates an object of the
 * Circle class using the first constructor and new Circle(25) created an object using the second constructor.
 *
 * The program contains two classes. TestSimpleCircle is the main class with the sole purpose testing SimpleCircle.
 * TestSimpleCircle is referred to as a client of the class. Multiple classes can exits in one file, but only one class
 * can be a public class, and this class must have the same name as the file. Each class in the source code is compiled
 * into a .class file.
 *
 * TestSimpleCircle contains the main method that creates three objects. As in creating an array, the 'new' operator
 * is used to create an object from within the constructor: new SimpleCircle() creates an object with radius 1.
 *
 * Objects of the same type are defined using a common class. The three objects created (circle1, circle2, and circle3)
 * have different data fields but the same methods. Therefore, the same getArea() method works on all of them.
 *
 * The data fields can be accessed via the reference of the object using:
 *      circle1.radius
 *
 * The object can invoke one of its methods via reference of the object using:
 *      circle1.getArea()
 * */