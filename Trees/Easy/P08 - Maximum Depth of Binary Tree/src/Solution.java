public class Solution {

    // Time Complexity  : O(n) as we are travelling through every node
    // Space Complexity : O(n) for recursion stack space
    public static int  maxDepth(TreeNode root) {
        return helper(root);
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        return 1 + Math.max(left, right);
    }
}
