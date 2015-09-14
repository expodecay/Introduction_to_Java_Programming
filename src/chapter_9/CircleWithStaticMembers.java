package chapter_9;

/**
 * pg. 338
 * Created by Rick on 8/17/2015.
 * A static variable is shared by all objects of  the class. For example: the number of circles created versus the radius
 * of each. The data field radius in the circle class is known as an instance variable. It is therefore tied to a
 * specific instance of the class (it is not shared among objects of the same class).
 *
 * Consider two circles with different radii. The radius of each is independent of the other and are stored in different
 * memory locations. Static variables (such as the number of circle objects created) are data fields that are shared
 * by all instances of the class and therefore, the values of those variables are stored in a common memory location.
 * Because of this common location, if one object changes the value of a static variable, all objects of the same class
 * are affected.
 *
 * Constants are shared by all objects of the class and are declared using the modifiers: final static
 *      final static double PI - 3.14159;
 */
public class CircleWithStaticMembers {
    /** The radius of the circle */
    double radius;                      // Instance data

    /** The number of objects created */
    static int numberOfObjects = 0;     // Static data (Don't need to set equal to 0) see pg.331 section 9.5.3

    /** Construct a circle with radius 1*/
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return numberOfObjects */
    static int getNumberOfObjects(){        // Static method
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea(){                      // Instance method
        return radius * radius * Math.PI;
    }
}
/**
 * Instance methods and data belong to instances and can be used only after the instances are created.
 * Static methods and data can be accessed from a reference variable or from their class name. Static methods can be
 * called without creating an instance of the class.
 */