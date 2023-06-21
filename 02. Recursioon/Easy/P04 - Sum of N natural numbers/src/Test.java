public class Test {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " numbers = " + sum(n));
    }

    public static int sum(int n) {
        if (n == 1)
            return 1;

        return n + sum(n-1);
    }
}
