public class Solution_Recursion {

    public static int MaximumNonAdjacentSum(int nums[]) {
        return helper(nums, 0);
    }

    private static int helper(int[] arr, int index) {
        if (index >= arr.length) return 0;

        // pick
        int pick = arr[index] + helper(arr, index+2);

        // not pick
        int notPick = helper(arr, index+1);

        return Math.max(pick, notPick);
    }
}
