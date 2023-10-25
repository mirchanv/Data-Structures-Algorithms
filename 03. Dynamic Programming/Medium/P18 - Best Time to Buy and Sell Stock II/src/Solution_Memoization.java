import java.util.Arrays;

public class Solution_Memoization {

    // Time Complexity  : O(nx2)
    // Space Complexity : O(n) for recursion stack space + O(nx2) for dp array
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(prices, 0, 0, dp);
    }

    private static int helper(int[] arr, int ind, int canBuy, int[][] dp) {
        if (ind == arr.length) return 0;

        if (dp[ind][canBuy] != -1) return dp[ind][canBuy];

        int profit = 0;
        if (canBuy == 0)
            profit = Math.max(-arr[ind] + helper(arr, ind+1, 1, dp), 0 + helper(arr, ind+1, 0, dp));
        else
            profit = Math.max(arr[ind] + helper(arr, ind+1, 0, dp), 0 + helper(arr, ind+1, 1, dp));

        return dp[ind][canBuy] = profit;
    }
}
