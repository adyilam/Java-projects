package interview;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Java program which implements a function that search a non-repeated
 * characters from a given string
 * Two ways :
 * 1. Using Set Collection
 * 2. Java 8 Stream findFirst()
 */
public class CharacterFilter {

    public static void main(String[] args) {
        //given string
        String str = "Challenge";
        System.out.println("Original input String: " + str);

        //method call, print the first non-repeated char
        Character result = findNonRepeatedCharacter(str);
        System.out.println("The first non-repeated character is: " + result);

        //method2 calling,
        Character result2 = findNonRepeatedCharacter2(str);
        System.out.println("The first non-repeated character is: " + result2);

    }

    /**
     * gets non-repeated chars using java8 stream findFirst()
     *
     * @param str
     * @return
     */
    private static Character findNonRepeatedCharacter2(String str) {
        Set<Character> nonRepeatChars = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            nonRepeatChars.add(c);
        }
        System.out.println("All non repeat chars: " + nonRepeatChars.toString());
        //find the first non repeat element
        return nonRepeatChars.stream().findFirst().get();
    }

    /**
     * This method gets the first non-repeated chars
     *
     * @param str
     * @return
     */
    private static Character findNonRepeatedCharacter(String str) {
        //converting  string to char array
        char[] chars = str.toCharArray();
        //set object to hold non-repeated chars
        Set<Character> nonRepeatedChars = new LinkedHashSet<>();
        Character firstCharacter = null;
        //iterating through the array and add the chars into the set, to avoid repeated chars
        for (char c : chars) {
            nonRepeatedChars.add(c);     //unique chars will be added
        }
        //PRINT ALL UNIQUE CHARS
        System.out.println("All non repeated chars: " + nonRepeatedChars.toString());
        //get the first non repeat character
        if (!nonRepeatedChars.isEmpty()) {
            firstCharacter = nonRepeatedChars.iterator().next();
        }
        return firstCharacter;
    }
}
