import chapter_9.CircleWithPrivateDataFields;

/**
 * Created by Rick on 8/5/2015.
 */
public class delete {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields();
        printCircle(myCircle);
    }
    public static void printCircle(CircleWithPrivateDataFields c){
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());

    }
}