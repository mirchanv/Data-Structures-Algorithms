public class Solution {

    public static boolean pathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);
    }

    private static boolean helper(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;

        sum += root.val;

        if (root.left == null && root.right == null && sum == targetSum) return true;

        return helper(root.left, targetSum, sum) || helper(root.right, targetSum, sum);
    }
}
