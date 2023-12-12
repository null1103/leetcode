package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.Test;
import problems.ValidParentheses;

public class ValidParenthesesTest {
    @Test
    public void test() {
        ValidParentheses testObject = new ValidParentheses();
        assertAll(
            () -> assertEquals(true, testObject.isValid("()")),
            () -> assertEquals(true, testObject.isValid("()[]{}")),
            () -> assertEquals(false, testObject.isValid("(]")),
            () -> assertEquals(false, testObject.isValid("((")),
            () -> assertEquals(false, testObject.isValid("][]"))
        );
    }
}
