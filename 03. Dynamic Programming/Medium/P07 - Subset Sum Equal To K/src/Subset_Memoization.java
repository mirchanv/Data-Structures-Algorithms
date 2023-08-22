import java.util.Arrays;

public class Subset_Memoization {

    // Time Complexity  : O(nxtarget)
    // Space Complexity : O(n) for recursion stack space + O(nxtarget) for dp array
    public static boolean subsetSumToK(int[] arr, int target) {
        if (arr.length > 0) {
            int[][] dp = new int[arr.length][target+1];
            for (int[] temp : dp) {
                Arrays.fill(temp, -1);
            }
            return helper(arr, arr.length - 1, target, dp);
        }
        return false;
    }

    private static boolean helper(int[] arr, int index, int target, int[][] dp) {
        if (target == 0) return true;
        if (index == 0) return arr[index] == target;

        if(dp[index][target] != -1) return dp[index][target] == 0 ? false:true;

        boolean pick = false;
        if (arr[index] <= target)
            pick = helper(arr, index-1, target-arr[index], dp);

        boolean notPick = helper(arr, index-1, target, dp);

        dp[index][target] = pick || notPick ? 1:0;
        return pick || notPick;
    }
}
