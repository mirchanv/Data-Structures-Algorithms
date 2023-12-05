public class PathSum_Recursion {

    // Time Complexity  : 2^mxn
    // Space Complexity : O(m-1) + O(n-1) for recursion stack space
    public static int minimumPathSum(int[][] grid) {
        if (grid.length == 0) return -1;

        int row = grid.length;
        int col = grid[0].length;

        return helper(grid, row-1, col-1);
    }

    private static int helper(int[][] grid, int rowIdx, int colIdx) {
        if (rowIdx == 0 && colIdx == 0) return grid[rowIdx][colIdx];
        else if (rowIdx < 0 || colIdx < 0) return Integer.MAX_VALUE;

        int up = helper(grid, rowIdx-1, colIdx);
        int left = helper(grid, rowIdx, colIdx-1);

        return grid[rowIdx][colIdx] + Math.min(up, left);
    }
}
