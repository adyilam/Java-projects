package interview;

import java.util.Arrays;

/**
 * 1. find the correct position
 * 2. insert the new item
 * 3. shift the item to the right to free a space for it (not swap)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7, 10, 4};
        //method call
        int[] result = insertionSearch(arr);
        int[] result2 = insertionSort1(arr);
        //print the values
        System.out.print("Sorted Elements of the array: " + Arrays.toString(result));
        System.out.print("\n" + "Sorted Elements of the array: " + Arrays.toString(result2));

    }

    private static int[] insertionSearch(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int firstValue = arr[i];
            int pos = i;
            //find the position to insert the value
            while ((pos > 0) && (arr[pos - 1] > firstValue)) {
                arr[pos] = arr[pos - 1];
                pos = pos - 1;
            }
            //insert the value at spec. pos
            arr[pos] = firstValue;
        }
        return arr;
    }

    public static int[] insertionSort1(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            int firstValue = arr[i];
            int pos = i - 1;

            while (pos > 0 && arr[pos] > firstValue) {
                arr[pos + 1] = arr[pos];
                pos = pos - 1;
            }
            arr[pos + 1] = firstValue;
        }
        return arr;
    }
}
