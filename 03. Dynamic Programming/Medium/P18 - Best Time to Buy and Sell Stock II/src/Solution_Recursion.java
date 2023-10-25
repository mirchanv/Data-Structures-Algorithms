public class Solution_Recursion {

    // Time Complexity  : O(2^n)
    // Space Complexity : O(n) for recursion stack space
    public static int maxProfit(int[] prices) {
        return helper(prices, 0, 0);
    }

    private static int helper(int[] arr, int ind, int canBuy) {
        if (ind == arr.length) return 0;

        int profit = 0;
        if (canBuy == 0)
            profit = Math.max(-arr[ind] + helper(arr, ind+1, 1), 0 + helper(arr, ind+1, 0));
        else
            profit = Math.max(arr[ind] + helper(arr, ind+1, 0), 0 + helper(arr, ind+1, 1));

        return profit;
    }
}

/*
    canBuy can have 2 values: 0 or 1
    -> where 0 represents, that you allowed to buy a stock
    -> where 1 represents, that you cannot buy a stock
*/
