public class Solution {

    static int maxi = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        helper(root);
        return maxi;
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        int maxPathSum = left + right + root.val;
        maxi = Math.max(maxi, maxPathSum);

        return root.val + Math.max(left, right);
    }
}
