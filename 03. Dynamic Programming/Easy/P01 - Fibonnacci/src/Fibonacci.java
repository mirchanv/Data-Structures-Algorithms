public class Fibonacci {

    // Time Complexity  : O(n)
    // Space Complexity : Extra array space used to store answers + recursive stack
    public static int fib_memo(int n, int[] answerBank) {
        if (n <= 1)
            answerBank[n] = n;

        // If fib of n is already stored in answerBank use it directly
        if (answerBank[n] != -1) {
            return answerBank[n];
        }

        // If fib of n not stored in answerBank then calculate it
        int fibmn1 = fib_memo(n - 1, answerBank);
        int fibmn2 = fib_memo(n - 2, answerBank);

        // store answer in answerBank
        int ans = fibmn1 + fibmn2;
        answerBank[n] = ans;

        // return ans
        return ans;
    }

    // Time Complexity  : O(n)
    // Space Complexity : Extra array space used to store answers + recursive stack
    public static int fib_tabu(int n, int[] answerBank) {
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                answerBank[i] = i;
                continue;
            }

            int fibnm1 = answerBank[i-1];
            int fibnm2 = answerBank[i-2];

            answerBank[i] = fibnm1 + fibnm2;
        }
        return answerBank[n];
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(1) No extra space used
    public static int fib_tabu_optimised(int n, int[] answerBank) {
        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
