public class Subsets_Recursion {

    // Time Complexity  : O(2^n)
    // Space Complexity : O(n) for recursion stack space
    public static int countSubsets(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int n = nums.length;
        return helper(nums, n-1, target);
    }

    private static int helper(int[] nums, int index, int target) {
        if (target == 0) return 1;
        else if (index == 0) return nums[index] == target ? 1 : 0;

        int pick = 0;
        if (nums[index] <= target)
            pick = helper(nums, index-1, target-nums[index]);

        int notPick = helper(nums, index-1, target);

        return pick + notPick;
    }
}
