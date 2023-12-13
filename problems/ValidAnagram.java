package problems;
import java.util.HashMap;
/**
 * https://leetcode.com/problems/valid-anagram/
 *
 * HASHMAP
 * - Return false if s and t lengths are not equal
 * - For s, update map as follows:
 *   - If character exists in map, increment the value by 1
 *   - If character doesn't exist in map, add with value 1
 * - For t, update map as follows:
 *   - If character exists in map, decrement the value by 1
 *   - If character doesn't exist in map, add with value -1
 * - Check if all the values in map are zero. If so, return true. Otherwise, false.
 *
 * Time:  O(n)
 * Space: O(n)
 */

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            Character sKey = s.charAt(i);
            Character tKey = t.charAt(i);

            if (map.containsKey(sKey)) {
                // char from s exists in map, increment count
                int sValue = map.get(sKey);
                map.put(sKey, sValue+1);
            } else {
                // char from s doesn't exist, add with count 1
                map.put(sKey, 1);
            }

            if (map.containsKey(tKey)) {
                // char from t exists, decrement count
                int tValue = map.get(tKey);
                map.put(tKey, tValue-1);
            } else {
                // char from t doesn exist, add with count -1
                map.put(tKey, -1);
            }
        }

        for(int value:map.values()) {
            if(value!=0) {
                return false;
            }
        }
        return true;
    }

}
