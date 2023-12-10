package problems;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * Iterate the array left to right.
 * If price on the right is higher, check if profit is greater than profit so far
 * If price on the right is lower, use this price further to see if there a higher profit
 * 
 * Time:  O(n)
 * Space: O(1)
 */

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
