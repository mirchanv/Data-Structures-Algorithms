public class Solution {

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        // go to the left node
        int left = countNodes(root.left);

        // go to the right node
        int right = countNodes(root.right);

        // Now leftSubtree and rightSubtree count of nodes are stored in left and right respectively
        // Add up the nodes in left and right plus 1 for the current node and return to previous recursive call
        return 1 + left + right;
    }
}
