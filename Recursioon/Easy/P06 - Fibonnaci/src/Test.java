public class Test {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(n + "th fib no. in series = " + fib(n));
    }

    // EXPECTATION : To return nth fib number
    // FAITH : Recursion will give fib(n-1) and fib(n-2)
    // TASK : Return fib(n-1) + fib(n-2)
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        return fibnm1 + fibnm2;
    }
}
