package chapter_9;

/**
 * pg.352
 * Created by Rick on 9/15/2015.
 * This program invokes createCircleArray() to create an array of five circle objects. The circle radii are randomly
 * generated using the Math.random() method. The createCircleArray method returns an array of CircleWithPrivateDataFields
 * objects. The array is passed to the printCircleArray method, which prints the radii and area of each circle, as well
 * as the total area of all the circle objects. The total area is computed using the sum method which takes the array
 * of CircleWithPrivateDataFields objects as the argument and returns a double value for the area.
 */
public class TotalArea {
    /** Main method */
    public static void main(String[] args) {
        // Declare circleArray
        CircleWithPrivateDataFields[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Circle objects */
    public static CircleWithPrivateDataFields[] createCircleArray(){
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

        for(int i = 0; i < circleArray.length; i++){
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }

        // Return circle array
        return circleArray;
    }

    /** Print an array of circles and their total area */
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("------------------------------------------");

        // Compute and display result
        System.out.printf("%-30s%-15f\n", "The total area of circle is", sum(circleArray));
    }

    /** Add circle areas */
    public static double sum(CircleWithPrivateDataFields[] circleArray){
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for(int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }
}
