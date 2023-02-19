package interview;

import java.util.*;
import java.util.logging.Logger;

/**
 * How do you swap two numbers without using the third variable? (solution)
 * Example: 12 output: 21
 */
public class NumberSwaper {
    private final static Logger log = Logger.getLogger("NumberSwaper.class");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.println("ENTER ANY INTEGER TO BE SWAPPED: ");
        try {
        } catch (InputMismatchException e) {
            log.warning("Exception, Only Integer allowed " + e.getMessage());
        }
        StringBuilder result = swap(input);
        sc.close();
        System.out.println("Reversed Numbers: " + result);
        System.out.println("Reversed Numbers:" + swapNumber(input));

    }

    /**
     * Option 1: Without using Library function
     *
     * @param num
     * @return
     */
    private static StringBuilder swap(int num) {
        String str = "" + num;
        String[] chars = str.split("");
        StringBuilder sb = new StringBuilder();

        //iterate through the loop & append the values directly
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);    //no third variable
        }
        return sb;
    }

    /**
     * Option2 : Using Collections reverse() method
     *
     * @param num
     */
    private static List<String> swapNumber(int num) {
        String str = "" + num;
        String[] chars = str.split("");
        List<String> nums = Arrays.asList(chars);
        Collections.reverse(nums);

        return nums;
    }
}
