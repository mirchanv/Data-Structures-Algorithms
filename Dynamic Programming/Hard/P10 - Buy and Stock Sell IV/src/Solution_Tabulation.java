public class Solution_Tabulation {

    public static int maxProfit(int[] prices, int k) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];

        // Base Case 1: if (ind == arr.length) return 0;
        for (int buy = 0; buy < 2; buy++) {
            for (int cap = 0; cap <= k; cap++) {
                dp[0][buy][cap] = 0;
            }
        }

        // Base Case 2: if (k == 0) return 0;
        for (int ind = 0; ind <= n; ind++) {
            for (int buy = 0; buy < 2; buy++) {
                dp[ind][buy][0] = 0;
            }
        }

        for (int ind = n-1; ind >= 0; ind--) {
            for (int canBuy = 0; canBuy < 2; canBuy++) {
                for (int cap = 1; cap <= k ; cap++) {
                    if (canBuy == 1) {
                        int buy = -prices[ind] + dp[ind+1][0][cap];
                        int skip = dp[ind+1][1][cap];
                        dp[ind][canBuy][cap] = Math.max(buy, skip);
                    } else {
                        int sell = prices[ind] + dp[ind+1][1][cap-1];
                        int skip = dp[ind+1][0][cap];
                        dp[ind][canBuy][cap] =  Math.max(sell, skip);
                    }
                }
            }
        }

        return dp[0][1][k];
    }
}
