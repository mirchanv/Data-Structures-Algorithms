import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] cost = {10,15,20};

        // recursion solution
        System.out.println("cost = " + Arrays.toString(cost));
        System.out.println("min cost = " + ClimbStairs_Recursion.minCostClimbingStairs(cost));

        // memoization solution
        System.out.println("min cost = " + ClimbStairs_Memoization.minCostClimbingStairs(cost));
    }
}
