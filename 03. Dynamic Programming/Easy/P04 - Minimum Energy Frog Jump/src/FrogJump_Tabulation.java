import java.util.Arrays;

public class FrogJump_Tabulation {

    public static int frogJump(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 0);

        return minJumps(arr, 0, dp);
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(n) for dp array
    private static int minJumps(int[] arr, int idx, int[] dp) {
        dp[arr.length-1] = 0;

        for (int i = arr.length-2; i >= 0; i--) {
            int oneStep = Math.abs(arr[i + 1] - arr[i]) + dp[i + 1];

            if ((i+2) <= arr.length-1) {
                int twoStep = Math.abs(arr[i + 2] - arr[i]) + dp[i + 2];
                dp[i] = Math.min(oneStep, twoStep);
            } else {
                dp[i] = oneStep;
            }
        }

        return dp[idx];
    }
}
