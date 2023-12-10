/**
 * Check if the middle element of sorted array is target. Otherwise,
 * - If target is less than middle element, check the left half of the array
 * - If target is greater than middle element, check the right half of the array
 * Repeat till element is found or there are no more elements to check
 * 
 * Time:  O(log n) 
 * Space: O(1)
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                // check right half
                start = mid+1;
            } else {
                // check left half
                end = mid-1;
            }
        }
        return -1;
    }
}
