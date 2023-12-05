public class Subset_Recursion {

    // Time Complexity  : O(2^n)
    // Space Complexity : O(n) recursion stack space
    public static boolean canPartition(int[] arr, int n) {
        int totalSum = 0;
        for (int val : arr) totalSum += val;

        if (arr.length > 1 && totalSum % 2 == 0) {
            return helper(arr, n-1, totalSum/2);
        }
        return false;
    }

    private static boolean helper(int[] arr, int index, int target) {
        if (target == 0) return true;
        else if (index == 0) return arr[index] == target;

        boolean notPick = helper(arr, index-1, target);
        boolean pick = false;

        if (arr[index] <= target) pick = helper(arr, index-1, target-arr[index]);

        return notPick || pick;
    }
}
