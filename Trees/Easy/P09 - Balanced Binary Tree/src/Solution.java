public class Solution {

    // Time Complexity  : O(n) in the worst case if we go through all nodes
    // Space Complexity : O(n) for recursion stack space in the worst case for a skewed vertical tree
    public static boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        if (left == -1) return -1;

        int right = helper(root.right);
        if (right == -1) return -1;

        if (Math.abs(left-right) > 1) return -1;

        return 1 + Math.max(left, right);
    }
}
