package problems;
import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams
 *
 * HASHMAP
 * - Iterate through "strs" and for each string "str":
 *   - Store count of each character in the count array. Convert to string to use as map's key.
 *   - Add str to the corresponding value list for the key
 *
 * Time:  O(m * n)
 * Space: O(m * n)
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            int[] count = new int[26];
            for (Character ch: str.toCharArray()) {
                count[ch-'a'] += 1;
            }
            String key = Arrays.toString(count);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
