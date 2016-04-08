package chapter_18;

/**
 * Created by Rick on 4/7/2016.
 *
 * A palindrome is a word that is the spelled the same in reverse.
 *
 * The substring method in line 8 creates a new string that is the same as the original string except without the first
 * and last characters.
 */
public class RecursivePalindromeUsingSubstring {

    public static boolean isPalindrome(String s){
        if (s.length() <= 1)
            return true;  // Base case
        else if (s.charAt(0) != s.charAt(s.length() -1))
            return false;  // Base case
        else
            return isPalindrome(s.substring(1, s.length() - 1));  // recursive call
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));

    }
}
