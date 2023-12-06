import java.util.*;

public class Solution {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.add(root);
        }

        boolean leftToRight = true;
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                if (temp != null) {
                    q.add(temp.left);
                    q.add(temp.right);
                    level.add(temp.val);
                }
            }

            if (!level.isEmpty()) {
                if (!leftToRight) {
                    Collections.reverse(level);
                    leftToRight = true;
                } else {
                    leftToRight = false;
                }
                ans.add(new ArrayList<>(level));
            }
        }
        return ans;
    }
}
