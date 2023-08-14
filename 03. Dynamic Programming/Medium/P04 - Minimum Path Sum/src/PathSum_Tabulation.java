import java.util.Arrays;

public class PathSum_Tabulation {

    // Time Complexity  : O(mxn)
    // Space Complexity : O(mxn) for dp array used
    public static int minimumPathSum(int[][] grid) {
        if (grid.length == 0) return -1;

        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];

        for (int[] arr: dp) {
            Arrays.fill(arr, -1);
        }

        return helper(grid, row-1, col-1, dp);
    }

    private static int helper(int[][] grid, int m, int n, int[][] dp) {
        for (int row = 0; row <= m ; row++) {
            for (int col = 0; col <= n ; col++) {
                if (row == 0 && col == 0) {
                    dp[row][col] = grid[row][col];
                    continue;
                }

                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;

                if (row > 0)
                    up =  dp[row-1][col];

                if (col > 0)
                    left = dp[row][col-1];

                dp[row][col] = grid[row][col] + Math.min(up, left);
            }
        }
        return dp[m][n];
    }
}
