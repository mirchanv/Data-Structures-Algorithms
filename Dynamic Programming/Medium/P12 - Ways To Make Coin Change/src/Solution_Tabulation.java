public class Solution_Tabulation {

    public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
        long[][] dp = new long[n][value+1];

        for(int i=0; i < n; i++) dp[i][0] = 1;

        for (int i=0; i<=value; i++) {
            if (denominations[0] <= value)
                if (value % denominations[0] == 0) dp[0][i] = 1;
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= value; target++) {
                long pick = 0;
                if (denominations[ind] <= target)
                    pick = dp[ind][target-denominations[ind]];

                long notPick = dp[ind-1][target];

                dp[ind][target] = pick + notPick;
            }
        }
        return dp[n-1][value];
    }
}
