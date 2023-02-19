package interview;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] result = removeDup(nums);
        removeDup3(nums);
        for (Object o : result) {
            if (!o.equals(0)) {
                System.out.print(o + " ");
            }
        }
    }

    /**
     * Option 1:
     * Create a temporary array temp[] to store unique elements.
     * Traverse input array and copy all the unique elements of a[] to temp[].
     * Also, keep count of unique elements. Let this count be j.
     * Copy j elements from temp[] to a[].
     *
     * @param nums
     * @return
     */
    private static int[] removeDup(int[] nums) {
        int size = nums.length;
        int[] tempArr = new int[size];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                tempArr[j++] = nums[i];
            }
            tempArr[j] = nums[size - 1];
        }
        return tempArr;
    }

    /**
     * Option 2:
     * Approach:
     * Take a Set
     * Insert all array elements in the Set. Set does not allow duplicates
     * and sets like LinkedHashSet maintains the order of insertion
     * so it will remove duplicates and elements will be
     * printed in the same order in which it is inserted.
     * Print elements of Set.
     *
     * @param nums
     * @return
     */
    private static Object[] removeDup2(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        return set.toArray();
    }

    /**
     * Option 3: Map
     * Approach:
     * Create a HashMap to store the unique elements.
     * Traverse the array.
     * Check if the element is present in the HashMap.
     * If yes, continue traversing the array.
     * Else Print the element and store the element in HashMap.
     *
     * @param nums
     * @return
     */
    private static void removeDup3(int[] nums) {

        //Hash map which will store the elements which has appeared previously.
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                System.out.print(nums[i] + " ");
                map.put(nums[i], true);
            }
        }
        System.out.println();
    }
}
