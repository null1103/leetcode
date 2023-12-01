import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 * 
 * 1. Iterate the array from beginning to end and in the output array store the product of all the nums before
 * 2. Iterate the array again but from end to beginning and calculate product of all the nums after
 * 3. Multiply the two to get product of all nums except self
 * 
 * Time:  O(n)
 * Space: O(n)
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] result = new int[size];

        // Product of all the nums before num[i]
        for (int i=0;i<size;i++) {
            if (i==0) {
                result[i] = 1;
            } else {
                result [i] = result[i-1]*nums[i-1];
            } 
        }

        // Product of all the nums after num[i]
        int suffix = 1;
        for (int j=size-1;j>=0;j--) {
            result[j] = result[j] * suffix;
            suffix = suffix * nums[j];
        }
        return result;
    } 
}
