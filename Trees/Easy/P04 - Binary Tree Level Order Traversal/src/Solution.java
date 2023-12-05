import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                if (temp != null) {
                    level.add(temp.val);
                    queue.add(temp.left);
                    queue.add(temp.right);
                }
            }

            if (!level.isEmpty()) ans.add(level);
        }

        return ans;
    }
}
