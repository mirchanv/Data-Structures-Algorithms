public class Obstacles_Recursion {

    // Time Complexity  : 2^mxn
    // Space Complexity : O(m-1) + O(n-1) for recursion stack space
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;

        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        return helper(obstacleGrid, row-1, col-1);
    }

    private static int helper(int[][] grid, int rowId, int colId) {
        if (rowId >= 0 && colId >= 0 && grid[rowId][colId] == -1) return 0;
        else if (rowId == 0 && colId == 0) return 1;
        else if (rowId < 0 || colId < 0) return 0;

        int up = helper(grid, rowId-1, colId);
        int left = helper(grid, rowId, colId-1);

        return up + left;
    }
}
