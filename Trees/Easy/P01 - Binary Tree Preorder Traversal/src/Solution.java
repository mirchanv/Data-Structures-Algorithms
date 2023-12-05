import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> preorder(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    private static void helper(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return;

        ans.add(root.val);
        helper(root.left, ans);
        helper(root.right, ans);
    }
}
