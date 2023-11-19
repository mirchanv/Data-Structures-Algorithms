import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    // Time Complexity  : O(n) since we are travelling for every node in the tree
    // Space Complexity : O(n)
    public static List<Integer> inorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> myStack = new Stack<>();

        TreeNode node = root;

        while (true) {
            if (node != null) {
                myStack.push(node);
                node = node.left;
            } else {
                if (myStack.isEmpty()) break;
                node = myStack.peek();
                ans.add(node.val);
                myStack.pop();
                node = node.right;
            }
        }

        return ans;
    }
}
