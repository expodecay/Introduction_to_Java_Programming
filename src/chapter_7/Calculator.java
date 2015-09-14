package chapter_7;

/**
 * pg. 274
 * To call the function from the command line (since there is a package associated with the class file) go to:
 *      DRIVE:\java\introduction to java programming\out\production\introduction to java programming
 *
 * To call the main method type:
 *      java chapter_7.Calculator
 *
 * Created by Rick on 8/15/2015.
 */
public class Calculator {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3){
            System.out.println("\nUsage: java Calculator operand1 operand2 operand3");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;

            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;

            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;

            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

}
/**
 * Integer.parseInt(args[0]) converts a digital string into an integer. The string must consist of digits. If not,
 * the program will terminate abnormally.
 * We use the . symbol for multiplication instead of * because the symbol * refers to all the files in the current
 * directory when it is used on a command line.
 * */
