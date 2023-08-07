public class Test {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        // solution using recursion
        System.out.println("Total no. of paths = " + UniquePaths_Recursion.uniquePaths(m, n));

        // solution using memoization
        System.out.println("Total no. of paths = " + UniquePaths_Memoization.uniquePaths(m, n));
    }
}
