package chapter_9;

/**
 * pg. 345
 * Created by Rick on 8/18/2015.
 *
 * The data field radius is declared private. Private data can be accessed only within their defining class, so you
 * cannot use myCircle.radius in the client program. A compile error would occur if you attempt to access private data
 * from a client.
 *
 * Since numberOfObjects is private, it cannot be modified. This prevents tampering. For example, the user cannot set
 * numberOfObjects to 100. The only to make it 100 would be to create 100 objects of the Circle class.
 */
public class CircleWithPrivateDataFields {
    /** The radius of the circle */
    private double radius = 1;

    /** The number of objects created */
    private static int numberOfObjects = 0;

    /** Construct a radius with radius 1 */
    public CircleWithPrivateDataFields(){
        numberOfObjects++;
    }

    /** Construct a circle with a specific radius */
    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius(){
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
