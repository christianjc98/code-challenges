package code.challenges;

import java.util.*;

public class Challenge_02 {

    /**
     * For the solution I created a new hash map to store the array values, them I iterated over the nums array and in each iteration I first
     * calculate the complement of nums[i] so the sum of both is equal to the target, after this I checked if the hash map contains the complement
     * as a key and if so I returned a new array with the value of the key which was the index, and the current index, if the map does not contain the
     * number as a key I just put the number as the key and the index as value.
     *
     * Time Complexity is O(n) because we only iterate over the array once
     * Space Complexity is O(n) because we create a Hash Map that could potentially store all values in the array
     *
     */

    public static void main(String[] args) {
        int[] nums = {2, 8, 1, 15};
        System.out.println(getSumElements(nums, 9));
    }

    public static List<Integer> getSumElements(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return List.of(map.get(complement), i);
            }
            map.put(nums[i], i);
        }

        return new ArrayList<>();
    }



}
