import java.util.Arrays;

public class Solution_Memoization {

    public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
        long[][] dp = new long[n][value+1];
        for (long[] arr : dp) Arrays.fill(arr, -1);

        return helper(denominations, n-1, value, dp);
    }

    private static long helper(int[] arr, int index, int target, long[][] dp) {
        if (index == 0) {
            if (target % arr[0] == 0) return 1;
            else return 0;
        }

        if (dp[index][target] != -1) return dp[index][target];

        long pick = 0;
        if (arr[index] <= target)
            pick = helper(arr, index, target-arr[index], dp);

        long notPick = helper(arr, index-1, target, dp);

        return dp[index][target] = pick + notPick;
    }
}
