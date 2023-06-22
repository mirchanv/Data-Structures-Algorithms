import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int floors = 5;
        int[] dp = new int[floors +1];
        Arrays.fill(dp, -1);

        System.out.println("Total number of paths : " + ClimbStairs.getTotalPaths(floors));
        System.out.println("Total number of paths : " + ClimbStairs.getTotalPaths_memo(floors, dp));
        System.out.println("Total number of paths : " + ClimbStairs.getTotalPaths_tabu(floors, dp));
        System.out.println("Paths are: ");
        ClimbStairs.printPaths(floors, "");

    }
}
