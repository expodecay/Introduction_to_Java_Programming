package chapter_4;

/**
 * Created by Rick on 7/21/2015.
 */
public class delete {
    public static void main(String[] args){
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is $" + interest);
        System.out.println("Interest is $" + (int)(interest * 100) / 100.0);
        System.out.printf("Interest is $%4.2f", interest);

        int count = 5;
        double amounts = 45.56;
        System.out.printf("count is %d and amounts is %.3f", count, amounts);
    }
}
