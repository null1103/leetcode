import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * HASHSET 
 * - Add all the elements to HashSet
 * - If all the elements are added successfully, there are no duplicates
 * 
 * Time:  O(n)
 * Space: O(n)
 */
public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            boolean isAdded = set.add(num);
            if (!isAdded) {
                // Set already contains the integer
                return true;
            }
        }
        return false;
    }
}
