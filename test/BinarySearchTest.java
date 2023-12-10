package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import problems.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        BinarySearch testObject = new BinarySearch();
        assertAll(
            () -> assertEquals(4,testObject.search(new int[]{-1,0,3,5,9,12}, 9),"Case 1"),
            () -> assertEquals(-1,testObject.search(new int[]{-1,0,3,5,9,12}, 2),"Case 2"),
            () -> assertEquals(1,testObject.search(new int[]{1,2,3,4,5}, 2),"Case 3")
        );
    }
}