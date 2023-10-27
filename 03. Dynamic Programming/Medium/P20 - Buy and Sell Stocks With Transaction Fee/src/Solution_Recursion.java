public class Solution_Recursion {

    public static int maxProfit(int[] prices, int fee) {
        return helper(prices, 0, 1, fee);
    }

    private static int helper(int[] arr, int ind, int canBuy, int fee) {
        if (ind == arr.length) return 0;

        if (canBuy == 1) {
            int buy = -arr[ind] + helper(arr, ind+1, 0, fee);
            int skip = 0 + helper(arr, ind+1, 1, fee);
            return Math.max(buy, skip);
        } else {
            int sell = arr[ind] - fee + helper(arr, ind+1, 1, fee);
            int skip = 0 + helper(arr, ind+1, 0, fee);
            return Math.max(sell, skip);
        }
    }
}
