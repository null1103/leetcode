/**
 * https://leetcode.com/problems/valid-parentheses/
 * 
 * Iterate characters in the string if the length is even
 * - Add left brackets to a stack
 * - When a right bracket is encountered, check if top element on a stack matches
 * - At the end, check if stack is empty
 * 
 * Time:  O(n)
 * Space: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            // odd number of brackets
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i=0;i<s.length();i++) {
            Character currentCharacter = s.charAt(i);

            if (currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '[') {
                stack.push(currentCharacter);
            } else {
                if (stack.isEmpty() || stack.pop() != getMatchingParentheses(currentCharacter)) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public char getMatchingParentheses(char ch) {
        char result;
        switch (ch) {
            case ')':
                result = '(';
                break;
            case '}':
                result =  '{';
                break;
            case ']':
                result =  '[';
                break;
            default:
                result =  ' ';
        }
        return result;
    }
}
