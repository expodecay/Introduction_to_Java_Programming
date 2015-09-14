package chapter_7;

import chapter_6.RandomCharacter;

/**
 * pg. 261
 * Created by Rick on 8/12/2015.
 * This program generates 100 random ass characters, then counts the occurrence of each letter,
 * organizes and prints the results.
 */
public class CountLettersInArray {
    /** Main method */
    public static void main(String[] args) {
        // Declare and create an array
        char[]  chars = createArray();

        // Display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        // Count the occurrences of each letter
        int[] counts = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }

    /** Create an array of characters */
    public static char[] createArray(){
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++){
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        // Return the array
        return chars;
    }
    /** Display the array of characters */
    public static void displayArray(char[] chars){
        // Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++){
            if ( (i+1) % 20 ==0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
    /** Count the occurrence of each letter */
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int (to store number of occurrences)
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++; // chars[0]=a, chars[1]=b...
        }
        return counts;
    }

        /** Display counts */
        public static void displayCounts(int[] counts){
            for (int i = 0; i < counts.length; i++){
                if ((i + 1) % 10 == 0)              // Index starts at 0 so index 9 corresponds the the 10th entry
                    System.out.println(counts[i] + " " + (char)(i + 'a')); // If i = 0, the letter is 'a' etc...
                else
                    System.out.print(counts[i] + " " + (char)(i + 'a') + "  "); // Starts a new line
            }
    }
}
/**
 * Note that if you were to write:
 *
 *      char[] chars = new char[100];
 *      chars = createArray();
 *
 * in the main method, you would be creating two arrays. The array created in the first line would be garbage because
 * it is no longer referenced, and Java will automatically collect it as garbage behind the scenes.
 *
 *
 * Note a brute force method to count the number of occurrences:
 *      for (int i = 0; i < chars.length; i++)
 *          if (chars[i] == 'a')
 *              count[0]++;
 *          else if (chars[i] == 'b')
 *              count[1]++;
 *          ...
 * */