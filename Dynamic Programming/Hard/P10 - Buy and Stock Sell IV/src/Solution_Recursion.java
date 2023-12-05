public class Solution_Recursion {

    public static int maxProfit(int[] prices, int k) {
        return helper(prices, 0, 1, k);
    }

    private static int helper(int[] arr, int ind, int canBuy, int limit) {
        if (ind == arr.length) return 0;
        else if (limit == 0) return 0;

        if (canBuy == 1) {
            int buy = -arr[ind] + helper(arr, ind+1, 0, limit);
            int skip = 0 + helper(arr, ind+1, 1, limit);
            return Math.max(buy, skip);
        } else {
            int sell = arr[ind] + helper(arr, ind+1, 1, limit-1);
            int skip = 0 + helper(arr, ind+1, 0, limit);
            return Math.max(sell, skip);
        }
    }
}

/*
    canBuy can have 2 values: 0 or 1
    -> where 0 represents, that you are NOT allowed to buy a stock
    -> where 1 represents, that you are allowed to buy a stock
*/
