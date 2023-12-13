package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.Test;
import problems.QueueUsingStacks;

public class QueueUsingStacksTest {

    @Test
    public void test(){
        QueueUsingStacks testObject = new QueueUsingStacks();
        testObject.push(1);
        testObject.push(2);
        assertAll(
            () -> assertEquals(1, testObject.pop()),
            () -> assertEquals(false, testObject.empty())
        );
    }
}
