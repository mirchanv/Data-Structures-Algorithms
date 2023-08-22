public class Subset_Tabulation {

    // Time Complexity  : O(nxtarget)
    // Space Complexity : O(nxtarget) for dp array
    public static boolean subsetSumToK(int[] arr, int target) {
        if (arr.length > 0) {
            boolean[][] dp = new boolean[arr.length][target+1];
            return helper(arr, arr.length - 1, target, dp);
        }
        return false;
    }

    private static boolean helper(int[] arr, int index, int k, boolean[][] dp) {
        for (int i = 0; i < arr.length; i++)
            dp[i][0] = true;

        if (arr[index] <= k)
            dp[0][arr[0]] = true;

        for (int idx = 1; idx < arr.length; idx++) {
            for (int target = 1; target <= k; target++) {
                boolean pick = false;
                if (arr[idx] <= target)
                    pick = dp[idx-1][target-arr[idx]];

                boolean notPick = dp[idx-1][target];
                dp[idx][target] = pick || notPick;
            }
        }
        return dp[arr.length-1][k];
    }
}
