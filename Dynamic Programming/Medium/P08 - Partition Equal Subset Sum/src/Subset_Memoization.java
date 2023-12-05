import java.util.Arrays;

public class Subset_Memoization {

    // Time Complexity  : O(nxtarget)
    // Space Complexity : O(n) for recursion stack space + O(nxtarget) for dp array
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int val : nums) totalSum += val;

        if (nums.length > 1 && totalSum % 2 == 0) {
            int[][] dp = new int[nums.length][(totalSum/2)+1];
            for (int[] arr : dp) Arrays.fill(arr, -1);

            return helper(nums, nums.length-1, totalSum/2, dp);
        }
        return false;
    }

    private static boolean helper(int[] arr, int index, int target, int[][] dp) {
        if (target == 0) return true;
        else if (index == 0) return arr[index] == target;

        if (dp[index][target] != -1) return dp[index][target] == 0 ? false : true;
        boolean notPick = helper(arr, index-1, target, dp);
        boolean pick = false;

        if (arr[index] <= target) pick = helper(arr, index-1, target-arr[index], dp);

        dp[index][target] = notPick || pick ? 1 : 0;
        return notPick || pick;
    }
}
