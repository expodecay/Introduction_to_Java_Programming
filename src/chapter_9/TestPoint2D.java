package chapter_9;

/**
 * pg. 336
 * Created by Rick on 8/17/2015.
 * Java API has a Point2D class in the javafx.geometry package for representing a point in a two dimensional plane.
 * This program creates two objects of the Point2D class.
 */
import java.util.Scanner;
import javafx.geometry.Point2D;
public class TestPoint2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
    }
}
/**
 *              javafx.geometry.Print2D
 *   +Point2D(x: double, y: double)
 *   +distance(x: double, y: double): double
 *   +distance(p: Point2D): double
 *   +getX(): double
 *   +getY(): double
 *   +toString(): String
 * */