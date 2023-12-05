import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 5;

        // recursive solution
        System.out.println("fib(" + n + ") = " + Fibonacci_Recursion.fib(n));

        // memoization solution
        int[] dp_memo = new int[n+1];
        Arrays.fill(dp_memo, -1);
        System.out.println("fib(" + n + ") = " + Fibonacci_Memoization.fib(n, dp_memo));

        // tabulation solution
        int[] dp_tabu = new int[n+1];
        Arrays.fill(dp_tabu, -1);
        System.out.println("fib(" + n + ") = " + Fibonacci_Tabulation.fib(n, dp_tabu));

        // tabulation optimised solution
        System.out.println("fib(" + n + ") = " + Fibonacci_Tabulation.fib_tabu_optimised(n));
    }
}
