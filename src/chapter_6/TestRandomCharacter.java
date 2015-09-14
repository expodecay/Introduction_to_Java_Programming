package chapter_6;

/**
 * pg. 224
 * Created by Rick on 8/3/2015.
 * Displays 175 random lowercase letters 25 at a time
 * Note how this program calls getRandomLowerCase from RandomCharacter
 */
public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int   CHARS_PER_LINE = 25;

        for (int i =0; i < NUMBER_OF_CHARS; i++){
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
