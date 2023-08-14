public class Test {
    public static void main(String[] args) {
        int[][] grid1 = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] grid2 = {{1,2,3},{4,5,6}};

        // solution using recursion
        System.out.println("Minimum Path Sum : " + PathSum_Recursion.minimumPathSum(grid1));
        System.out.println("Minimum Path Sum : " + PathSum_Recursion.minimumPathSum(grid2) + "\n");

        // solution using memoization
        System.out.println("Minimum Path Sum : " + PathSum_Memoization.minimumPathSum(grid1));
        System.out.println("Minimum Path Sum : " + PathSum_Memoization.minimumPathSum(grid2) + "\n");

        // solution using tabulation
        System.out.println("Minimum Path Sum : " + PathSum_Tabulation.minimumPathSum(grid1));
        System.out.println("Minimum Path Sum : " + PathSum_Tabulation.minimumPathSum(grid2));
    }
}
