package problems;

/**
 * https://leetcode.com/problems/ransom-note
 * Iterate the magazine string and store count for each character in the array
 * Iterate the ransomNote string and check if array has a count for that character and decrement by 1
 * If the count becomes 0 before all the characters in ransom note are checked, return false
 *
 * Time: O(m+n)
 * Space: O(m)
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (Character ch: magazine.toCharArray()) {
            count[ch-'a']++;
        }
        for (Character ch: ransomNote.toCharArray()) {
            if(count[ch-'a']==0) {
                return false;
            }
            count[ch-'a']--;
        }

        return true;
    }
}
