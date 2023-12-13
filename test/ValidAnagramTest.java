package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

import problems.ValidAnagram;

public class ValidAnagramTest {
    @Test
    public void test() {
        ValidAnagram testObject = new ValidAnagram();
        assertAll(
            () -> assertEquals(true, testObject.isAnagram("anagram", "nagaram")),
            () -> assertEquals(false, testObject.isAnagram("rat", "car"))
        );
    }
}
