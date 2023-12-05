public class Solution_Tabulation {

    // Time Complexity  : O(nx2) or O(n^2)
    // Space Complexity : O(nx2) or O(n^2) for dp array
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];

        dp[n][0] = 0;
        dp[n][1] = 0;

        for (int ind = n-1; ind >= 0 ; ind--) {
            for (int canBuy = 0; canBuy <= 1; canBuy++) {
                int profit = 0;
                if (canBuy == 0)
                    profit = Math.max(-prices[ind] + dp[ind+1][1], dp[ind+1][0]);
                else
                    profit = Math.max(prices[ind] + dp[ind+1][0], dp[ind+1][1]);

                dp[ind][canBuy] = profit;
            }
        }
        return dp[0][0];
    }
}
