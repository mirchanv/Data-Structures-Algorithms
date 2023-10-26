public class Solution_Recursion {

    public static int maxProfit(int[] prices) {
        return helper(prices, 0, 1);
    }

    private static int helper(int[] arr, int ind, int canBuy) {
        if (ind == arr.length) return 0;

        if (canBuy == 1) {
            int buy = -arr[ind] + helper(arr, ind+1, 0);
            int skip = 0 + helper(arr, ind+1, 1);
            return Math.max(buy, skip);
        } else {
            int sell = arr[ind];
            if ((ind+2) < arr.length)
                sell += helper(arr, ind+2, 1);
            int skip = 0 + helper(arr, ind+1, 0);
            return Math.max(sell, skip);
        }
    }
}
