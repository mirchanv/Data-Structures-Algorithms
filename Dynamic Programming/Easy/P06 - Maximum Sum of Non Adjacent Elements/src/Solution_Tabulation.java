import java.util.Arrays;

public class Solution_Tabulation {

    //  Time Complexity: O(N)
    //  Reason: We are running a simple iterative loop

    //  Space Complexity: O(N)
    //  Reason: We are using dp array of same size as input array.

    public static int MaximumNonAdjacentSum(int nums[]) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return helper(nums, nums.length-1, dp);
    }

    private static int helper(int[] arr, int index, int[] dp) {
        dp[index] = arr[index];

        for (int i = index-1; i >= 0 ; i--) {
            // pick
            int pick = arr[i];

            if (i+2 < arr.length)
                pick += dp[i + 2];

            // not pick
            int notPick = dp[i+1];

            dp[i] = Math.max(pick, notPick);

        }
        return dp[0];
    }
}
