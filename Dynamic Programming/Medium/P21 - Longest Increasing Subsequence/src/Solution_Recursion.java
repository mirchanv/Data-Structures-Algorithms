public class Solution_Recursion {

    public static int lengthOfLIS(int[] nums) {
        return helper(nums, 0, -1);
    }

    private static int helper(int[] arr, int ind, int prev) {
        if (ind == arr.length) return 0;

        int pick = 0;
        if (prev == -1 || arr[ind] > arr[prev])
            pick = 1 + helper(arr, ind+1, ind);

        int notPick = 0 + helper(arr, ind+1, prev);

        return Math.max(pick, notPick);
    }
}
