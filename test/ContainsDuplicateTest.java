package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

import problems.ContainsDuplicate;

public class ContainsDuplicateTest {

    @Test
    public void test(){
        ContainsDuplicate testObject = new ContainsDuplicate();
        assertAll(
            () -> assertEquals(true, testObject.containsDuplicate(new int[]{1,2,3,1})),
            () -> assertEquals(false, testObject.containsDuplicate(new int[]{1,2,3,4})),
            () -> assertEquals(true, testObject.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}))
        );
    }
    
}
