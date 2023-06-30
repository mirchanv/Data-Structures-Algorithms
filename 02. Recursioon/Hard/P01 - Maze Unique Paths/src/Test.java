public class Test {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println("Input: m=" + m + ", n=" + n);
        System.out.println("Total paths are : " + Solution.uniquePaths(m, n));
        System.out.println("All paths are : ");
        Solution.printPaths(m, n);
    }
}
