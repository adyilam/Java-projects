package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Java program to implement a function that reverse
 * a given string
 * Two ways:
 * 1. Using reverse() method of Collections class
 * 2. Using append() method of StringBuilder
 */
public class ReverseString {

    public static void main(String[] args) {
        //get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY STRING: ");
        String input = sc.nextLine();

        //1. reverse string using StringBuilder append() method
        StringBuilder reversedStringValue = reverseString(input);
        System.out.println("Reversed string: " + reversedStringValue);

        //2. reverse using Collections.reverse()
        List<Character> revString = reverseString2(input);
        System.out.println("Reversed String: " + revString);

    }

    private static List<Character> reverseString2(String input) {
        char[] chars = input.toCharArray();
        List<Character> listOfRevChars = new ArrayList<>();
        for (char cr : chars) {
            listOfRevChars.add(cr);
        }
        Collections.reverse(listOfRevChars);
        return listOfRevChars;
    }

    private static StringBuilder reverseString(String input) {
        //covert string to char array
        char[] chars = input.toCharArray();
        int size = chars.length;
        StringBuilder revString = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            revString.append(chars[i]);
        }
        return revString;
    }
}
