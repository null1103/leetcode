package problems;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * Boyer-Moore Majority Voting Algorithm: 
 * https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/
 * 
 * Time:  O(n)
 * Space: O(1)
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;
        for (int num: nums) {
            if (count == 0 && majorityElement!=num) {
                majorityElement = num;
                count = 1;
            } else if(majorityElement == num) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }
}
