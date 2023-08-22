public class Subset_Recursion {

    // Time Complexity  : O(2^n)
    // Space Complexity : O(n) recursion stack space
    public static boolean subsetSumToK(int[] arr, int target) {
        if (arr.length > 0)
            return helper(arr, arr.length-1, target);

        return false;
    }

    private static boolean helper(int[] arr, int index, int target) {
        if (target == 0) return true;
        if (index == 0) return arr[index] == target;

        boolean pick = false;
        if (arr[index] <= target)
            pick = helper(arr, index-1, target-arr[index]);

        boolean notPick =  helper(arr, index-1, target);

        return pick || notPick;
    }
}
