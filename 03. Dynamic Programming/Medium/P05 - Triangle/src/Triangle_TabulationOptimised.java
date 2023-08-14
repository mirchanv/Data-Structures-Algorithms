import java.util.List;

public class Triangle_TabulationOptimised {

    // Time Complexity  : O(nxn)
    // Space Complexity : O(n)
    public static int minimumTotal(List<List<Integer>> triangle) {
        return helper_spaceOptimised(triangle);
    }

    private static int helper_spaceOptimised(List<List<Integer>> triangle) {
        int[] frontRow = new int[triangle.size()];
        int[] currRow = new int[triangle.size()];

        // base case for frontRow
        for (int col = 0; col < triangle.size() ; col++)
            frontRow[col] = triangle.get(triangle.size()-1).get(col);

        for (int row = triangle.size()-2; row >=0; row--) {
            for (int col = row; col >= 0 ; col--) {
                int down = frontRow[col];
                int diagonal = frontRow[col+1];

                currRow[col] = triangle.get(row).get(col) + Math.min(down, diagonal);
            }
            frontRow = currRow;
        }
        return  frontRow[0];
    }
}
