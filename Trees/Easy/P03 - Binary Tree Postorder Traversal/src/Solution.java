import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> postorder(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    private static void helper(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return;

        helper(root.left, ans);
        helper(root.right, ans);
        ans.add(root.val);
    }
}
