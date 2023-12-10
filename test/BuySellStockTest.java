package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import problems.BuySellStock;

public class BuySellStockTest {

    @Test
    public void test() {
        BuySellStock testObject = new BuySellStock();
        assertAll(
            () -> assertEquals(5, testObject.maxProfit(new int[]{7,1,5,3,6,4}), "Case 1"),
            () -> assertEquals(0, testObject.maxProfit(new int[]{7,6,4,3,1}), "Case 2")
        );
    }
}
