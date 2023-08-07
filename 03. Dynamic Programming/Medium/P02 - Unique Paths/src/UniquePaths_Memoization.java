import java.util.Arrays;

public class UniquePaths_Memoization {

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return helper(m-1, n-1, dp);
    }

    private static int helper(int rowIdx, int colIdx, int[][] dp) {
        if (rowIdx == 0 && colIdx == 0) return 1;
        else if (rowIdx < 0 || colIdx < 0) return 0;

        if (dp[rowIdx][colIdx] != -1) return dp[rowIdx][colIdx];

        int up = helper(rowIdx-1, colIdx, dp);
        int left = helper(rowIdx, colIdx-1, dp);

        return dp[rowIdx][colIdx] = up + left;
    }
}
