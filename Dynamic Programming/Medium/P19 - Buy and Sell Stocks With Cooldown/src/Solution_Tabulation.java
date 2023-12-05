import java.util.Arrays;

public class Solution_Tabulation {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];

        dp[n][0] = 0;
        dp[n][1] = 0;

        for (int ind = n-1; ind >= 0; ind--) {
            for (int canBuy = 0; canBuy < 2; canBuy++) {
                if (canBuy == 1) {
                    int buy = -prices[ind] + dp[ind+1][0];
                    int skip = dp[ind+1][1];
                    dp[ind][canBuy] = Math.max(buy, skip);
                } else {
                    int sell = prices[ind];
                    if ((ind+2) < prices.length)
                        sell += dp[ind+2][1];
                    int skip = dp[ind+1][0];
                    dp[ind][canBuy] = Math.max(sell, skip);
                }
            }
        }
        return dp[0][1];
    }
}
