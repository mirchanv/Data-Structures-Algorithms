import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> traverseBoundary(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) return ans;
        ans.add(root.val);

        if (isLeafNode(root)) return ans;

        addLeftNodes(root, ans);
        addLeafNodes(root, ans);
        addRightNodes(root, ans);

        return ans;
    }

    private static boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private static void addLeftNodes(TreeNode root, List<Integer> ans) {
        TreeNode currNode = root.left;

        while (currNode != null) {
            if (!isLeafNode(currNode)) ans.add(currNode.val);
            if (currNode.left != null) currNode = currNode.left;
            else currNode = currNode.right;
        }
    }

    private static void addLeafNodes(TreeNode root, List<Integer> ans) {
        if (isLeafNode(root)) {
            ans.add(root.val);
            return;
        }

        if (root.left != null) addLeafNodes(root.left, ans);
        if (root.right != null) addLeafNodes(root.right, ans);
    }

    private static void addRightNodes(TreeNode root, List<Integer> ans) {
        TreeNode currNode = root.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while (currNode != null) {
            if (!isLeafNode(currNode)) temp.add(currNode.val);
            if (currNode.right != null) currNode = currNode.right;
            else currNode = currNode.left;
        }

        for (int i = temp.size()-1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }
}
