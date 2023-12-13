package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.Test;
import problems.RansomNote;

public class RansomNoteTest {
    @Test
    public void test() {
        RansomNote testObject = new RansomNote();
        assertAll(
            () -> assertEquals(false, testObject.canConstruct("a", "b")),
            () -> assertEquals(false, testObject.canConstruct("aa", "ab")),
            () -> assertEquals(true, testObject.canConstruct("aa", "aab"))
        );
    }
}
