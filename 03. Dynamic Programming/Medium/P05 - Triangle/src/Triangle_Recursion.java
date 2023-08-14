import java.util.List;

public class Triangle_Recursion {

    // Time Complexity  : 2^
    // Space Complexity : O(n) for recursion stack space, where n represents the number of rows
    public static int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle, 0, 0);
    }

    private static int helper(List<List<Integer>> triangle, int rowIdx, int colIdx) {
        if(rowIdx == triangle.size()-1) return triangle.get(rowIdx).get(colIdx);

        int down = helper(triangle, rowIdx+1, colIdx);
        int diagonal = helper(triangle, rowIdx+1, colIdx+1);

        return triangle.get(rowIdx).get(colIdx) + Math.min(down, diagonal);
    }
}
