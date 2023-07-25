import java.util.Arrays;

public class FrogJump_Memoization {

    public static int frogJump(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        return minJumps(arr, 0, dp);
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(n) for recursion stack space + O(n) for dp array
    private static int minJumps(int[] arr, int idx, int[] dp) {
        if (idx == arr.length-1)
            return 0;

        if (dp[idx] != -1) return dp[idx];

        int oneStep = Math.abs(arr[idx+1] - arr[idx]) + minJumps(arr, idx + 1, dp);

        if ((idx+2) <= arr.length-1) {
            int twoStep = Math.abs(arr[idx + 2] - arr[idx]) + minJumps(arr, idx + 2, dp);
            return dp[idx] = Math.min(oneStep, twoStep);
        }

        return dp[idx] = oneStep;
    }
}
