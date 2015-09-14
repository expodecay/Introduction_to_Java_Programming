package chapter_9;

/**
 * pg. 338
 * Created by Rick on 8/17/2015.
 * A static variable is shared by all objects of  the class. For example: the number of circles created versus the radius
 * of each.
 */
public class CircleWithStaticMembers {
    /** The radius of the circle */
    double radius;                      // Instance data

    /** The number of objects created */
    static int numberOfObjects = 0;     // Static data (Don't need to set equal to 0)

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
 * Static methods and data can be accessed from a reference variable or from their class name.
 */