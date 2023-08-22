public class Subset_Tabulation {

    // Time Complexity  : O(nxtarget)
    // Space Complexity : O(nxtarget) for dp array
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int val : nums) totalSum += val;

        if (nums.length > 1 && totalSum % 2 == 0) {
            int k = totalSum/2;
            boolean[][] dp = new boolean[nums.length][k+1];
            return helper(nums, nums.length-1, k, dp);
        }
        return false;
    }

    private static boolean helper(int[] arr, int index, int k, boolean[][] dp) {
        for (int i = 0; i < arr.length; i++) dp[i][0] = true;
        if (arr[0] <= k) dp[0][arr[0]] = true;

        for (int idx = 1; idx < arr.length; idx++) {
            for (int target = 1; target <= k ; target++) {
                boolean notPick = dp[idx-1][target];
                boolean pick = false;
                if (arr[idx] <= target) pick = dp[idx-1][target-arr[idx]];

                dp[idx][target] = notPick || pick;
            }
        }
        return dp[index][k];
    }
}
