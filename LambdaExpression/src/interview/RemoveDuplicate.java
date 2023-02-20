package interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Java program to remove duplicates from the given array
 * Options:
 * 1. Without using any library
 * 2. Using Set Collection
 * 3. Using Map
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        //sample numbers
        int[] nums = {1, 2, 3, 1};   //have number 1 two times
        //method 1 call
        int[] result = removeDup(nums);

        //display the result is next
        System.out.println("Unique Numbers of the given array:");
        System.out.print("Method 1: ");
        for (Object o : result) {
            if (!o.equals(0)) {
                System.out.print(o + " ");
            }
        }

        //method 2 call
        Object[] value = removeDup2(nums);
        //print the value
        System.out.print("Method 2: ");
        for (Object o : value) {
            System.out.print(o + " ");
        }

        //method 3 call
        System.out.print("Method 3: ");
        removeDup3(nums);
    }

    /**
     * Option 3:
     * Create a HashMap to store the unique elements
     * Traverse the array, Check if the element is present in the HashMap
     * if yes, continue traversing the array,
     * ELSE, print  the elements and store the element in HashMap.
     *
     * @param nums
     */
    private static void removeDup3(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                System.out.print(nums[i] + " ");
                map.put(nums[i], true);
            }
        }
        System.out.println();
    }

    /**
     * Option 2:
     * Use a set collection
     * Insert all elements of array in to a set, since Set doesn't allow duplicate values
     * Use LinkedHashSet to maintain the order of insertion so that elements will be printed
     * in same order in which it's inserted.
     *
     * @param nums
     * @return
     */
    private static Object[] removeDup2(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        return set.toArray();  //will get unique elements of array
    }

    /**
     * Option1:
     * Sort the numbers ascending order
     * Create a temporary array temp[] to store unique elements
     * Traverse through input array and copy all the unique elements of nums[] to temp[]
     *
     * @param nums
     * @return
     */
    private static int[] removeDup(int[] nums) {
        int size = nums.length;
        int[] tempArr = new int[size];
        //order the numbers ascending
        sortNum(nums);

        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                tempArr[j++] = nums[i];
            }
            tempArr[j] = nums[size - 1];
        }

        return tempArr;
    }

    private static void sortNum(int[] nums) {
        //using bubble sort algo.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    //swap the numbers
                    swapNum(i, j, nums);
                }
            }
        }
    }

    private static void swapNum(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
