package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import problems.TwoSum;

public class TwoSumTest {
    @Test
    public void test() {
        TwoSum testObject = new TwoSum();
        assertAll(
            () -> assertArrayEquals(new int[]{0,1}, testObject.twoSum(new int[]{2,7,11,15}, 9)),
            () -> assertArrayEquals(new int[]{1,2}, testObject.twoSum(new int[]{3,2,4}, 6))
        );
        
    }
}
