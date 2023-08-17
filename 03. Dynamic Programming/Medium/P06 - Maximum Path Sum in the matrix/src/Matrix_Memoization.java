import java.util.Arrays;

public class Matrix_Memoization {

    public static int getMaxPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(grid, 0, 0, dp);
    }

    private static int helper(int[][] grid, int rowIdx, int colIdx, int[][] dp) {
        if (rowIdx < 0 || colIdx < 0 || colIdx == grid[rowIdx].length) return Integer.MIN_VALUE;
        else if (rowIdx == grid.length - 1) return grid[rowIdx][colIdx];

        if (dp[rowIdx][colIdx] != -1) return dp[rowIdx][colIdx];

        int down, downLeft, downRight;
        int maxPathSum = Integer.MIN_VALUE;

        if (rowIdx == 0) {
            for (int i = 0; i < grid[0].length; i++) {
                down = helper(grid, rowIdx + 1, i, dp);
                downLeft = helper(grid, rowIdx + 1, i - 1, dp);
                downRight = helper(grid, rowIdx + 1, i + 1, dp);
                dp[rowIdx][i] = maxPathSum = Math.max(maxPathSum, grid[rowIdx][i] + Math.max(down, Math.max(downLeft, downRight)));
            }
            return maxPathSum;
        }

        down = helper(grid, rowIdx + 1, colIdx, dp);
        downLeft = helper(grid, rowIdx + 1, colIdx - 1, dp);
        downRight = helper(grid, rowIdx + 1, colIdx + 1, dp);
        return dp[rowIdx][colIdx] = grid[rowIdx][colIdx] + Math.max(down, Math.max(downLeft, downRight));
    }
}
