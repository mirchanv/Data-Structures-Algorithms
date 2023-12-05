import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("INPUT : " + n);

        // recursion solution
        System.out.println("OUTPUT : " + ClimbingStairs_Recursion.climbingStairs(n));

        // memoization solution
        int[] dp_memo = new int[n+1];
        Arrays.fill(dp_memo, -1);
        System.out.println("OUTPUT : " + ClimbingStairs_Memoization.climbingStairs(n, dp_memo));

        // tabulation solution
        int[] dp_tabu = new int[n+1];
        Arrays.fill(dp_tabu, -1);
        System.out.println("OUTPUT : " + ClimbingStairs_Tabulation.climbingStairs(n, dp_tabu));

        // tabulation optimised solution
        System.out.println("OUTPUT : " + ClimbingStairs_Tabulation.climbingStairs_optimised(n));
    }
}
