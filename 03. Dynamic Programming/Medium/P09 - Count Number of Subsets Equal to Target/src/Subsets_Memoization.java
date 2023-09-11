import java.util.Arrays;

public class Subsets_Memoization {

    // Time Complexity  : O(nxtarget)
    // Space Complexity : O(n) for recursion stack space + O(nxtarget) for dp array
    public static int countSubsets(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int n = nums.length;

        int[][] dp = new int[n][target+1];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(nums, n-1, target, dp);
    }

    private static int helper(int[] nums, int index, int target, int[][] dp) {
        if (target == 0) return 1;
        else if (index == 0) return nums[index] == target ? 1 : 0;

        if (dp[index][target] != -1) return dp[index][target];

        int pick = 0;
        if (nums[index] <= target)
            pick = helper(nums, index-1, target-nums[index], dp);

        int notPick = helper(nums, index-1, target, dp);

        return dp[index][target] = pick + notPick;
    }
}
