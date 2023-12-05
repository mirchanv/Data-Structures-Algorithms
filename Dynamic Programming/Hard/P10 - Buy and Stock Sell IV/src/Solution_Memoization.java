import java.util.Arrays;

public class Solution_Memoization {

    public static int maxProfit(int[] prices, int k) {
        int n = prices.length;
        int[][][] dp = new int[n][2][k+1];

        for (int[][] arr : dp)
            for (int[] innerArr : arr)
                Arrays.fill(innerArr, -1);

        return helper(prices, 0, 1, k, dp);
    }

    private static int helper(int[] arr, int ind, int canBuy, int limit, int[][][] dp) {
        if (ind == arr.length) return 0;
        else if (limit == 0) return 0;

        if (dp[ind][canBuy][limit] != -1) return dp[ind][canBuy][limit];

        if (canBuy == 1) {
            int buy = -arr[ind] + helper(arr, ind+1, 0, limit, dp);
            int skip = 0 + helper(arr, ind+1, 1, limit, dp);
            return dp[ind][canBuy][limit] = Math.max(buy, skip);
        } else {
            int sell = arr[ind] + helper(arr, ind+1, 1, limit-1, dp);
            int skip = 0 + helper(arr, ind+1, 0, limit, dp);
            return dp[ind][canBuy][limit] =  Math.max(sell, skip);
        }
    }
}
