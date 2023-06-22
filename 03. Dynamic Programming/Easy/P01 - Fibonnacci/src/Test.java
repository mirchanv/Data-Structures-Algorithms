import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println("Fib(" + n + ") = " + Fibonacci.fib_memo(n, dp));
        System.out.println("Fib(" + n + ") = " + Fibonacci.fib_tabu(n, dp));
        System.out.println("Fib(" + n + ") = " + Fibonacci.fib_tabu_optimised(n, dp));
    }
}
