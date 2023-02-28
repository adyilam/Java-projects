package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Java program to find the median of the numbers of an array
 * STEP:
 * 1. Sort the numbers ascending order
 * 2. If the given number if ODD, get the middle number in the list, (n/2)
 * 3. ELSE, if the number is EVEN,, get the average of the middle two
 * numbers, (n/2 + n-1/2)
 */
public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY NUMBERS YOU WANTED TO ENTER?");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("ENTER THE NUMBERS ONE BY ONE: ");
        //receive input from user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        double median = findMedian(size, Arrays.asList(arr));
        //print the median of the given numbers
        System.out.println(median);

    }

    private static double findMedian(int size, List<Integer> list) {
        //order the list
        Collections.sort(list);

        if (size % 2 != 0) { //if number is odd
            return list.get(size / 2);
        } else {
            return (list.get(size / 2) + list.get(size - 1) / 2) / 2.0;
        }
    }
}
