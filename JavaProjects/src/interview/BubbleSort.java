package interview;

import java.util.Arrays;

/**
 * Implementation of a bubble sorting algorithm for integer array
 */
public class BubbleSort {

    public static void main(String[] args) {
        //given integer array
        int[] numbers = {4, 2, 7, 3, 5, 6};
        int[] numbers1 = {0, 3, -1, 2, 1};

        //print unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(numbers));
        System.out.println("Unsorted array: " + Arrays.toString(numbers1));

        //print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(numbers)));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(numbers1)));

    }

    //This method sorts integer array
    private static int[] bubbleSort(int[] numbers) {
        //To sort this array , we need a nested loop
        for (int i = 0; i < numbers.length; i++) { //outer loop
            for (int j = i + 1; j <= numbers.length - 1; j++) { //inner loop
                if (numbers[i] > numbers[j]) {
                    //swap the values
                    swap(numbers, i, j);
                }
            }
        }
        return numbers;
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
