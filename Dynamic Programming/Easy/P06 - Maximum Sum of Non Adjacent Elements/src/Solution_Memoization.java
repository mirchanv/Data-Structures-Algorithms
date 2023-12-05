import java.util.Arrays;

public class Solution_Memoization {

    //  Time Complexity: O(N)
    //  Reason: We are running a simple iterative loop

    //  Space Complexity: O(N) + O(N) = O(N)
    //  Reason: Recursion stack space + dp array of same size as input array.

    public static int MaximumNonAdjacentSum(int nums[]) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return helper(nums, 0, dp);
    }

    private static int helper(int[] arr, int index, int[] dp) {
        if (index >= arr.length) return 0;

        if(dp[index] != -1) return dp[index];

        // pick
        int pick = arr[index] + helper(arr, index+2, dp);

        // not pick
        int notPick = helper(arr, index+1, dp);

        return dp[index] = Math.max(pick, notPick);
    }
}
