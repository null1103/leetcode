package problems;

/**
 * https://leetcode.com/problems/longest-palindrome
 * Store frequency of each character in a hashmap
 * Add even frequencies to the final count
 * For odd frequencies, add value-1 as it is the number of pairs possible
 * If odd frequency exists, additional 1 to be added for the singular character in center
 *
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character,Integer> freq = new HashMap<>();
        for (Character ch: s.toCharArray()) {
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        for (int value: freq.values()) {
            if(value % 2 == 0) {
                count += value;
            } else {
                count += value-1;
                if(count % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
