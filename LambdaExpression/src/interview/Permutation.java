package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two strings,write a method to decide if one is a permutation of the
 * other.
 * Steps:
 * 1. Change the strings to lowercase or uppercase
 * 2. Sort the string characters lexicographically
 * 3. Compare each character of the two strings and if it's not equal return false, else return true
 */
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string :");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean result = isPermutation(str1, str2);
        System.out.println("Is Sting1 a permutation of String2: " + result);
    }

    private static boolean isPermutation(String str1, String str2) {
        //base case check
        if (str1.length() != str2.length())
            return false;

        char[] str1Chars = str1.toLowerCase().toCharArray();
        char[] str2Chars = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        for (int i = 0; i < str1Chars.length; i++) {
            if (str1Chars[i] != str2Chars[i]) {
                return false;
            }
        }
        return true;
    }
}
