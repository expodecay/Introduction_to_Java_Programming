package chapter_9;

/**
 * Created by Rick on 9/15/2015.
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

    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i<circleArray.length; i++){
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("————————————————————————————————");

        System.out.printf("%-30s%-15s\n", "The total area of circles is", sum(circleArray));
    }
    public static double sum(CircleWithPrivateDataFields[] circleArray){
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++){
            sum+=circleArray[i].getArea();
        }
        return sum;
    }
}
