public class Solution {

    private static int maxDiameter;

    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxDiameter;
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        maxDiameter = Math.max(maxDiameter, left  + right);

        return 1 + Math.max(left, right);
    }
}
