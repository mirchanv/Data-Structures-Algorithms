public class Tabulation {

    public static int minSubsetSumDifference(int[] arr, int n) {
        int totalSum = 0;
        for (int val : arr) totalSum += val;

        int k = totalSum;
        boolean[][] dp = new boolean [n][k+1];

        helper(arr, n, k, dp);

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= totalSum; i++) {
            if (dp[n-1][i]) {
                int subset1Sum = i;
                int subset2Sum = totalSum - i;
                mini = Math.min(mini, Math.abs(subset1Sum-subset2Sum));
            }
        }
        return mini;
    }

    private static void helper(int[] arr, int n, int k, boolean[][] dp) {
        for (int i = 0; i < dp.length; i++) dp[i][0] = true;
        if (arr[0] <= k) dp[0][arr[0]] = true;

        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= k ; target++) {
                boolean pick = false;
                if (arr[i] <= target)
                    pick = dp[i-1][target-arr[i]];

                boolean notPick = dp[i-1][target];

                dp[i][target] = pick || notPick;
            }
        }
    }
}
