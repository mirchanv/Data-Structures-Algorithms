import java.util.Arrays;

public class PathSum_Memoization {

    // Time Complexity  : O(mxn)
    // Space Complexity : O(m-1) + O(n-1) for recursion stack space + O(mxn) for dp array
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

    private static int helper(int[][] grid, int rowIdx, int colIdx, int[][] dp) {
        if (rowIdx == 0 && colIdx == 0) return grid[rowIdx][colIdx];
        else if (rowIdx < 0 || colIdx < 0) return Integer.MAX_VALUE;

        if (dp[rowIdx][colIdx] != -1) return dp[rowIdx][colIdx];

        int up = helper(grid, rowIdx-1, colIdx, dp);
        int left = helper(grid, rowIdx, colIdx-1, dp);

        return dp[rowIdx][colIdx] = grid[rowIdx][colIdx] + Math.min(up, left);
    }
}
