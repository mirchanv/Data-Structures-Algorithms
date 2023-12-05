import java.util.Arrays;

public class Solution_Memoization {

    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(prices, 0, 1, fee, dp);
    }

    private static int helper(int[] arr, int ind, int canBuy, int fee, int[][] dp) {
        if (ind == arr.length) return 0;

        if (dp[ind][canBuy] != -1) return dp[ind][canBuy];

        if (canBuy == 1) {
            int buy = -arr[ind] + helper(arr, ind+1, 0, fee, dp);
            int skip = 0 + helper(arr, ind+1, 1, fee, dp);
            return dp[ind][canBuy] = Math.max(buy, skip);
        } else {
            int sell = arr[ind] - fee + helper(arr, ind+1, 1, fee, dp);
            int skip = 0 + helper(arr, ind+1, 0, fee, dp);
            return dp[ind][canBuy] = Math.max(sell, skip);
        }
    }
}
