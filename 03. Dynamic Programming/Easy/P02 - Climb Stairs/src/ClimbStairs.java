public class ClimbStairs {

    public static int getTotalPaths(int n) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;

        int j1 = getTotalPaths(n-1);
        int j2 = getTotalPaths(n-2);
        int j3 = getTotalPaths(n-3);

        int totalPaths = j1 + j2 + j3;
        return totalPaths;
    }

    public static void printPaths(int n, String path) {
        if (n == 0) {
            System.out.println(">> " + path);
            return;
        } else if (n < 0)
            return;

        printPaths(n-1, path + "1 ");
        printPaths(n-2, path + "2 ");
        printPaths(n-3, path + "3 ");
    }

    public static int getTotalPaths_memo(int n, int dp[]) {
        if (n == 0)
            return dp[n] = 1;
        else if (n < 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int j1 = getTotalPaths_memo(n-1, dp);
        int j2 = getTotalPaths_memo(n-2, dp);
        int j3 = getTotalPaths_memo(n-3, dp);

        int totalPaths = j1 + j2 + j3;
        dp[n] = totalPaths;
        return dp[n];
    }

    public static int getTotalPaths_tabu(int n, int dp[]) {
        for (int i = 0; i <= n ; i++) {
            if (n == 0) {
                dp[n] = 1;
                continue;
            } else if (n < 0) {
                dp[n] = 0;
                continue;
            }

            int j1 = dp[n-1];
            int j2 = dp[n-2];
            int j3 = dp[n-3];
            return dp[n] = j1 + j2 + j3;
        }

        return dp[n];
    }
}
