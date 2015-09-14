package chapter_6;

/**
 * pg. 216
 * Created by Rick on 7/16/2015.
 * Demonstrates modularization
 */
public class PrimeNumberMethod {
    public static void main(String[] args){
        System.out.println("The first 1000 prime numbers are \n");
        printPrimeNumbers(1000);
    }

    public static void printPrimeNumbers(int numberOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of primes
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (count < numberOfPrimes){
            // Print the prime number and increase the count
            if (isPrime(number)){
                count++; // Increase the count
            if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                //Print the number and advance to the new line
                System.out.printf("%-5s\n", number);
                // %-5s : % is a format specifier, - means left justify (default is right), and s is a string
            }
            else
                System.out.printf("%-5s", number);
            }
            // Check whether the next number is prime
            number++;
        }
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){ // If true, number is not prime
                return false; // Number is not prime
            }
        }
        return true; // Number is prime
    }
}
