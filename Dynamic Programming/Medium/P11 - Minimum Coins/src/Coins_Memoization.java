import java.util.Arrays;

public class Coins_Memoization {

    public static int minimumElements(int num[], int x) {
        int[][] dp = new int[num.length][x+1];
        for (int[ ]arr : dp) Arrays.fill(arr, -1);

        int ans =  helper(num, num.length-1, x, dp);
        if (ans >= (int)Math.pow(10,9)) return -1;
        return ans;
    }

    private static int helper(int[] arr, int index, int target, int[][]dp) {
        if (index == 0) {
            if (target % arr[0] == 0)
                return (target / arr[0]);
            else
                return (int)Math.pow(10,9);
        }

        if (dp[index][target] != -1) return dp[index][target];

        int pick = Integer.MAX_VALUE;
        if (arr[index] <= target)
            pick = 1 + helper(arr, index, target - arr[index], dp);

        int notPick = 0 + helper(arr, index-1, target, dp);

        return dp[index][target] = Math.min(pick, notPick);
    }
}
