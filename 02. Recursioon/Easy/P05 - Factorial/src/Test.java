public class Test {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " +factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n-1);
    }
}
