package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Find the median of the odd numbers of an array
 * step:
 * 1. sort the numbers ascending order
 * 2. IF the given number is ODD, get the middle number in the list, (n/2)
 * 3. ELSE if the number is EVEN, get the average of the middle two numbers, (n/2 + n-1/2)
 */
public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY ODD NUMBERS YOU WANTED TO ENTER: ");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("ENTER ODD NUMBERS ONE BY ONE: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.asList(arr);
        double median = findMedian(size, Arrays.asList(arr));
        System.out.println(median);
    }

    public static double findMedian(int n, List<Integer> arr) {
        //order the array
        Collections.sort(arr);
        if (n % 2 != 0) {
            return arr.get(n / 2);   //odd num median
        } else {
            return (arr.get(n / 2) + arr.get(n - 1) / 2) / 2.0;   //even num median
        }
    }
}
