package chapter_18;

/**
 * Created by Rick on 4/7/2016.
 *
 * pg. 713
 * In RecursivePalindromeUsingSubstring.java, the function isPalindrome() is inefficient because it creates a new string
 * with every recursive call. This program reconciles this by incorporating indices in a helper method.
 */
public class RecursivePalindrome {

    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length()-1 );
    }
    public static boolean isPalindrome(String s, int low, int high){
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);  // Same string with shifted indices.
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));

    }
}
