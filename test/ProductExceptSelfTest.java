package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import problems.ProductExceptSelf;

public class ProductExceptSelfTest {
    @Test
    public void test() {
        ProductExceptSelf testObject = new ProductExceptSelf();
        assertAll(
            () -> assertArrayEquals(new int[]{24,12,8,6}, testObject.productExceptSelf(new int[]{1,2,3,4})),
            () -> assertArrayEquals(new int[]{0,0,9,0,0}, testObject.productExceptSelf(new int[]{-1,1,0,-3,3}))
        );
    }
}
