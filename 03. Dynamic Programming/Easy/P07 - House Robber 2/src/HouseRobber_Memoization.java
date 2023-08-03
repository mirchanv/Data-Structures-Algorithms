import java.util.Arrays;

public class HouseRobber_Memoization {

    public static int rob(int[] money) {
        if (money.length == 1)
            return money[0];

        int[] dp_temp1 = new int[money.length];
        int[] dp_temp2 = new int[money.length];
        Arrays.fill(dp_temp1, -1);
        Arrays.fill(dp_temp2, -1);

        int ans1 = helper(money, 0, money.length-1, dp_temp1);
        int ans2 = helper(money, 1, money.length, dp_temp2);
        return Math.max(ans1, ans2);
    }

    private static int helper(int[] arr, int startIndex, int endIndex, int[] dp) {
        if (startIndex >= endIndex) return 0;

        if (dp[startIndex] != -1) return dp[startIndex];

        int pick = arr[startIndex]+ helper(arr, startIndex + 2, endIndex, dp);
        int notPick = helper(arr, startIndex + 1, endIndex, dp);

        return dp[startIndex] = Math.max(pick, notPick);
    }
}
