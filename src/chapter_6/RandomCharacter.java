package chapter_6;

/**
 * pg. 224
 * Created by Rick on 8/3/2015.
 * Demonstrates how different methods of generating random characters.
 *
 *      Unicode for 'a' is (int)'a'
 *      Random integer between (int)'a' and (int)'z' is
 *          (int)((int)'a' + Math.Random() * ((int)'z' - (int)'a' + 1))
 *
 *      Note that the char operand is cast into a number if the other operand is a number or a character.
 *      Therefore we can simplify the preceding as:
 *          'a' + Math.random() * ('z' - 'a' + 1)
 *      And a random lowercase letter is:
 *          (char)('a' + Math.random() * ('z' - 'a' + 1))
 */
public class RandomCharacter {
    public static void main(String[] args) {
        System.out.println(getRandomCharacter('a', 'Z'));
        System.out.println(getRandomLowerCaseLetter());
        System.out.println(getRandomUpperCaseLetter());
        System.out.println(getRandomDigitCharacter());
        System.out.println(getRandomCharacter());
    }

    /** Generate a random character between ch1 and ch2. */
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random()*(ch2 - ch1 + 1));
    }
    /** Generate a random lowercase letter. */
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }
    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter(){
        return (char)getRandomCharacter('A', 'Z');
    }
    /** Generate a random digit character */
    public static char getRandomDigitCharacter(){
        return (char)getRandomCharacter('0', '9');
    }
    /** Generate a random character */
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
