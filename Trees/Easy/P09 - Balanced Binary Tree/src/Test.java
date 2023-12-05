public class Test {

    public static void main(String[] args) {
        // Example 1
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Binary Tree is balanced? " + Solution.isBalanced(root));

        // Example 2
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        System.out.println("Binary Tree is balanced? " + Solution.isBalanced(root));

        // Example 3
        root = null;

        System.out.println("Binary Tree is balanced? " + Solution.isBalanced(root));
    }
}
