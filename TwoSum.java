import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * HASHMAP
 * Iterate through nums:
 * - If the number doesn't exist in hashmap, add it as key with index as value
 * - If it does exist, return current index and value associated with the key in hashmap
 * 
 * Time:  O(n)
 * Space: O(n)
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if (map.containsKey(currentNum)) {
                return new int[] { map.get(currentNum), i };
            }

            map.put(target - currentNum, i);
        }

        return new int[] {};
    }

}
