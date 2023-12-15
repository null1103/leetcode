package problems;
/**
 * https://leetcode.com/problems/first-bad-version
 *
 * Time:  O(log n)
 * Space: O(1)
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)) {
                //check left half to see if there is a previous bad version
                right = mid-1;
            } else {
                //if bad false, check right half
                left = mid+1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int version) {
        // placeholder for leetcode one
        return (version == 4 || version == 5);
    }
}
