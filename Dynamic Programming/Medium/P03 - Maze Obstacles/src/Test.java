public class Test {
    public static void main(String[] args) {
        int[][] obstaclesMaze = {{0, -1}, {0, 0}};

        // Solution using recursion
        System.out.println("Total number of unique paths = " + Obstacles_Recursion.uniquePathsWithObstacles(obstaclesMaze));

        // Solution using memoization
        System.out.println("Total number of unique paths = " + Obstacles_Memoization.uniquePathsWithObstacles(obstaclesMaze));

        // Solution using tabulation
        System.out.println("Total number of unique paths = " + Obstacles_Tabulation.uniquePathsWithObstacles(obstaclesMaze));
    }
}
