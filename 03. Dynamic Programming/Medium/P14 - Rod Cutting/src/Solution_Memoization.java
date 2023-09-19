import java.util.Arrays;

public class Solution_Memoization {

    public static int cutRod(int price[], int n) {
        int[][] dp = new int[n][n + 1];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(price, n - 1, n, dp);
    }

    private static int helper(int[] arr, int index, int target, int[][] dp) {
        if (index == 0) return target * arr[0];

        int cut = Integer.MIN_VALUE;
        if (index + 1 <= target)
            cut = arr[index] + helper(arr, index, target - (index + 1), dp);

        int notCut = 0 + helper(arr, index - 1, target, dp);

        return dp[index][target] = Math.max(cut, notCut);
    }
}
