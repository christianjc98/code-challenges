package code.challenges;
import java.util.*;


public class Challenge_01 {

    /**
     * For the solution I created a new hash set from the nums array to remove all the duplicated elements,
     * after that I iterated over the range 1 to nums.length and checked if the current index was present in the set,
     * if it wasn't then I added that index to the result Array.
     *
     * Time Complexity is O(n) because we have two loops, but they are not nested.
     * Space Complexity is O(n) because we create a Set that potentially could store all items of the nums array if neither of them are repeated.
     *
     */



    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = integersInRangeNotInArr(nums);
        System.out.println(missingNumbers);
    }

    public static List<Integer> integersInRangeNotInArr(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }


}
