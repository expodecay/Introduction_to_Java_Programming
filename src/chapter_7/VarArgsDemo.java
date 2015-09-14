package chapter_7;

/**
 * pg. 264
 * Created by Rick on 8/13/2015.
 * This program prints the max value in a list of an unspecified number of values.
 * You can pass a variable number of arguments of the same type to a method. The parameter in the method is declared as:
 *
 *      typeName... parameterName
 *
 * Java treats a variable-length parameter as an array, therefore, you can pass an array or a variable number of arguments
 */
public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(34, 3,3,2,56.5); // invoke with variable-length argument
        printMax(new double[]{1,2,3}); // invoke with an array
    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);

    }
}
