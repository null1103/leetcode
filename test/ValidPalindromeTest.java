package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

import problems.ValidPalindrome;

public class ValidPalindromeTest {
    @Test
    public void test() {
        ValidPalindrome testObject = new ValidPalindrome();
        assertAll(
            () -> assertTrue(testObject.isPalindrome("A man, a plan, a canal: Panama")),
            () -> assertFalse(testObject.isPalindrome("race a car")),
            () -> assertEquals(true, testObject.isPalindrome(""))
        );
    }
}
