package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Java program helps to swap two numbers without using the third variable
 * Example:
 * input: 5436
 * output: 6345
 */
public class NumberSwapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.println("ENTER ANY INTEGER TO BE SWAPPED");
        input = sc.nextInt();
        sc.close();

        StringBuilder result = swap(input);
        System.out.println("Numbers in Reversed order: " + result);

        //we can use Collections reverse() lib method
        System.out.println("Numbers in Reversed order: " + swapNumber(input));

    }

    /**
     * using Collections reverse() method
     *
     * @param input
     * @return
     */
    private static List<String> swapNumber(int input) {
        //convert num to string
        String str = "" + input;
        String[] chars = str.split("");
        List<String> nums = Arrays.asList(chars);
        //reverse the numbers
        Collections.reverse(nums);

        return nums;
    }

    /**
     * Swapping the given numbers without using predefined lib.
     *
     * @param input
     * @return
     */
    private static StringBuilder swap(int input) {
        String str = "" + input;
        String[] chars = str.split("");
        StringBuilder sb = new StringBuilder();

        //iterate through the array of chars and append the values directly to sb desc. order
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb;
    }
}
