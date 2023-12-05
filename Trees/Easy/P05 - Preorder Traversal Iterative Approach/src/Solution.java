import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    // Time Complexity  : O(n) since we are travelling for every node in the tree
    // Space Complexity : O(n)
    public static List<Integer> preorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> myStack = new Stack<>();

        if (root != null)
            myStack.push(root);

        while (!myStack.isEmpty()) {
            TreeNode temp = myStack.pop();
            if (temp != null) {
                ans.add(temp.val);
                if (temp.right != null) myStack.push(temp.right);
                if (temp.left != null) myStack.push(temp.left);
            }
        }

        return ans;
    }
}
