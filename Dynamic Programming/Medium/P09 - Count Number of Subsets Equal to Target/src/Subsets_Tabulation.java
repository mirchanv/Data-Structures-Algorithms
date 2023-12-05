import java.util.Arrays;

public class Subsets_Tabulation {

    // Time Complexity  : O(nxtarget)
    // Space Complexity : O(nxtarget) for dp array
    public static int countSubsets(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int n = nums.length;
        int[][] dp = new int[n][target+1];

        return helper(nums, n, target, dp);
    }

    private static int helper(int[] arr, int n, int k, int[][] dp) {
        for (int i = 0; i < n; i++) dp[i][0] = 1;
        if (arr[0] <= k) dp[0][arr[0]] = 1;

        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
                int pick = 0;
                if (arr[ind] <= target)
                    pick = dp[ind - 1][target - arr[ind]];

                int notPick = dp[ind - 1][target];

                dp[ind][target] = pick + notPick;
            }
        }
        return dp[n-1][k];
    }
}
