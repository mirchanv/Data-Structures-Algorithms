import java.util.Arrays;

public class Coins_Tabulation {

    public static int minimumElements(int num[], int x) {
        int n = num.length;
        int[][] dp = new int[n][x+1];

        for (int i = 0; i <= x ; i++) {
            if(i % num[0] == 0)
                dp[0][i] = i / num[0];
            else
                dp[0][i] = (int)Math.pow(10,9);
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= x ; target++) {
                int pick = Integer.MAX_VALUE;
                if (num[ind] <= target)
                    pick = 1 + dp[ind][target - num[ind]];

                int notPick = 0 + dp[ind-1][target];

                dp[ind][target] = Math.min(pick, notPick);
            }
        }

        if (dp[n-1][x] >= (int) Math.pow(10, 9)) return -1;
        else return dp[n-1][x];
    }
}
