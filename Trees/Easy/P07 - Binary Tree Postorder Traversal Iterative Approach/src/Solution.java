import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static List<Integer> postorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> temp = new Stack<>();
        Stack<TreeNode> postOrderStack = new Stack<>();

        if (root != null) temp.push(root);

        while (!temp.empty()) {
            postOrderStack.push(temp.pop());

            TreeNode node = postOrderStack.peek();
            ans.add(node.val);
            if (node.left != null) temp.push(node.left);
            if (node.right != null) temp.push(node.right);
        }

        Collections.reverse(ans);
        return ans;
    }
}
