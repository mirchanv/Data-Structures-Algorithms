public class Solution {

    // Time Complexity  : O(n)
    // Space Complexity : O(1) as no extra space is used
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int currMini = prices[0];

        for (int day = 1; day < n; day++) {
            // checking what profit I can make if I sell the stock on current day
            int sellStock = prices[day] - currMini;

            // checking if profit made is the max so far
            maxProfit = Math.max(maxProfit, sellStock);

            // keeping track of the minimum element before each day
            currMini = Math.min(currMini, prices[day]);
        }

        return maxProfit;
    }
}
