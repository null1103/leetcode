package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.Test;
import problems.MajorityElement;

public class MajorityElementTest {
    
    @Test
    public void test() {
        MajorityElement testObject = new MajorityElement();
        assertAll(
            () -> assertEquals(3, testObject.majorityElement(new int[]{3,2,3})),
            () -> assertEquals(2, testObject.majorityElement(new int[]{2,2,1,1,1,2,2}))
        );
    }
}
