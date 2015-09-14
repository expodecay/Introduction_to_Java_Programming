package chapter_6;

/**
 * pg. 209
 * Created by Rick on 7/12/2015.
 * A VOID method does not return a value.
 */
public class TestVoidMethod {

    public static void main(String[] args){
        System.out.print("The grade is: ");
        PrintGrade(78.5); // PrintGrade is invoked as a statement since it doesn't return anything

        System.out.print("The grade is: ");
        PrintGrade(59.5);
    }
    public static void PrintGrade(double score){
        if (score >= 90.0)
            System.out.println('A');
        else if (score >= 80.0)
            System.out.println('B');
        else if (score >= 70.0)
            System.out.println('C');
        else if (score >= 60.0)
            System.out.println('D');
        else
            System.out.println("F");

    }
}
