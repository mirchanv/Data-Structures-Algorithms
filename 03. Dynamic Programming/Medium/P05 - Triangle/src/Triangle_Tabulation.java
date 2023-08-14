import java.util.Arrays;
import java.util.List;

public class Triangle_Tabulation {

    // Time Complexity  : O(nxn)
    // Space Complexity : O(nxn) for dp array, where n represents the number of rows
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(triangle, dp);
    }

    private static int helper(List<List<Integer>> triangle, int[][] dp) {
        for (int row = triangle.size()-1; row >=0; row--) {
            for (int col = row; col >= 0 ; col--) {
                if(row == triangle.size()-1) {
                    dp[row][col] = triangle.get(row).get(col);
                    continue;
                }

                int down = dp[row+1][col];
                int diagonal = dp[row+1][col+1];

                dp[row][col] = triangle.get(row).get(col) + Math.min(down, diagonal);
            }
        }

        return dp[0][0];
    }
}
