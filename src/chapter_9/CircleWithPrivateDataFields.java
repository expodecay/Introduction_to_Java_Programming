package chapter_9;

/**
 * pg. 345
 * Created by Rick on 8/18/2015.
 *
 * The data field radius is declared private. This is to prevent direct modifications of data fields, and is known as
 * 'data field encapsulation'. Private data can be accessed only within their defining class, so you cannot use
 * myCircle.radius in the client program. A compile error would occur if you attempt to access private data from a client.
 *
 * Since numberOfObjects is private, it cannot be modified. This prevents tampering. For example, the user cannot set
 * numberOfObjects to 100. The only to make it 100 would be to create 100 objects of the Circle class.
 */
public class CircleWithPrivateDataFields {
    /** The radius of the circle */
    private double radius = 1;      //encapsulate radius

    /** The number of objects created */
    private static int numberOfObjects = 0;     //encapsulate numberOfObjects

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
    public double getRadius(){      //accessor
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius){        //mutator
        radius = (newRadius >= 0) ? newRadius : 0;  // if new radius is set to negative, it is reset to 0.
    }                                               // This gives us control over how the radius property is accessed

    /** Return numberOfObjects */
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
/**
 * A private data field cannot be accessed by an object from outside the class that defines the private field. However,
 * a client often needs to retrieve and modify a data field. To make private data fields accessible, provide a getter
 * method to return its value. To enable a private data field to be updated, provide a setter method. getter is referred
 * to as an accessor and a setter to a mutator.
 *
 * Accessor signature:       public returnType getPropertyName()
 * Mutator signature:        public void setPropertyName(dataType propertyValue)
 * */