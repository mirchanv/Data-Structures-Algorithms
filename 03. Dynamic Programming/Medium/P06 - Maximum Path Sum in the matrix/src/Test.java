public class Test {
    public static void main(String[] args) {
        int[][] grid1 = {{1, 2, 10, 4}, {100, 3, 2, 1}, {1, 1, 20, 2}, {1, 2, 2, 1}};
        int[][] grid2 = {{10, 2, 3}, {3, 7, 2}, {8, 1, 5}};


        // Solution using recursion
        System.out.println("Max Path Sum = " + Matrix_Recursion.getMaxPathSum(grid1));
        System.out.println("Max Path Sum = " + Matrix_Recursion.getMaxPathSum(grid2) + "\n");

        // Solution using memoization
        System.out.println("Max Path Sum = " + Matrix_Memoization.getMaxPathSum(grid1));
        System.out.println("Max Path Sum = " + Matrix_Memoization.getMaxPathSum(grid2));
    }
}
