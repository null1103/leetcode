package problems;
/**
 * https://leetcode.com/problems/valid-palindrome
 *
 * Use two pointers for the start and end of string
 * While start < end:
 * - If the current chars are not alphanumeric, increment start or decrement end accordingly
 * - If alphanumeric chars at start and end are not equal (ignore case), return false
 * - If chars at start and end are equal (ignore case), increment start and decrement end
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            Character startChar = s.charAt(start);
            Character endChar = s.charAt(end);
            if (!Character.isLetterOrDigit(startChar)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}