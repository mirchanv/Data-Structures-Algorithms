import java.util.Arrays;

public class Solution_Memoization {

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];

        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(nums, 0, -1, dp);
    }

    private static int helper(int[] arr, int ind, int prev, int[][] dp) {
        if (ind == arr.length) return 0;

        if (dp[ind][prev+1] != -1) return dp[ind][prev+1];

        int pick = 0;
        if (prev == -1 || arr[ind] > arr[prev])
            pick = 1 + helper(arr, ind+1, ind, dp);

        int notPick = 0 + helper(arr, ind+1, prev, dp);

        return dp[ind][prev+1] = Math.max(pick, notPick);
    }
}
