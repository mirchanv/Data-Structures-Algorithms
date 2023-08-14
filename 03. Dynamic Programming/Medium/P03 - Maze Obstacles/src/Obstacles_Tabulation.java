import java.util.Arrays;

public class Obstacles_Tabulation {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;

        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return helper(obstacleGrid, row-1, col-1, dp);
    }

    private static int helper(int[][] grid, int m, int n, int[][] dp) {

        for (int row = 0; row <= m; row++) {
            for (int col = 0; col <= n; col++) {
                if (grid[row][col] == -1) dp[row][col] = 0;
                else if (row == 0 && col == 0) dp[row][col] = 1;
                else {
                    int up = 0, left = 0;

                    if (row > 0) up = dp[row - 1][col];
                    if (col > 0) left = dp[row][col - 1];

                    dp[row][col] = up + left;
                }
            }
        }
        return dp[m][n];
    }
}
