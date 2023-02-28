package interview;

import java.util.Arrays;

/**
 * How to implement a binary search algorithm in java?
 * GIVEN: sorted array of numbers
 * EXAMPLE: input : a number to be searched = 6
 * output: position of the number: 5 , Value: 6
 */
public class BinarySearch {
    public static void main(String[] args) {
        //create sorted array of integer
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Given array of numbers: " + Arrays.toString(numbers));

        int low = 0;
        int high = numbers.length - 1;
        int sKey = 1;   //this is the number we are looking for ?

        //calling a binary search method which returns index/pos of the value
        int pos = binarySearch(numbers, low, high, sKey);

        //print the index  of the skey and its value
        if (pos != -1) {
            System.out.println("Number found at index: " + pos + " Value: " + numbers[pos]);
        } else {
            System.out.println("Number not found");
        }

    }

    private static int binarySearch(int[] numbers, int low, int high, int sKey) {
        //iterate through until we get the sKey
        while (low <= high) {
            int mid = (low + high) / 2;  //divides the array size  by half
            if (sKey == numbers[mid]) {  //if found, return the pos
                return mid;
            } else if (sKey > numbers[mid]) {
                low = mid + 1; //move the index to the right
            } else {
                high = mid - 1; //move the index to the left
            }
        }
        return -1;
    }
}
