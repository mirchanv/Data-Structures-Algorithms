import java.util.Arrays;

public class Obstacles_Memoization {

    // Time Complexity  : O(mxn)
    // Space Complexity : O(m-1) + O(n-1) for recursion stack space + O(mxn) dp array
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

    private static int helper(int[][] grid, int rowId, int colId, int[][] dp) {
        if (rowId >= 0 && colId >= 0 && grid[rowId][colId] == -1) return 0;
        else if (rowId == 0 && colId == 0) return 1;
        else if (rowId < 0 || colId < 0) return 0;

        if (dp[rowId][colId] != -1)
            return dp[rowId][colId];

        int up = helper(grid, rowId-1, colId, dp);
        int left = helper(grid, rowId, colId-1, dp);

        return dp[rowId][colId] = up + left;
    }
}
