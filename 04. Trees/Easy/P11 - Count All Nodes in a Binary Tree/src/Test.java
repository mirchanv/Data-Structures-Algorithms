public class Test {

    public static void main(String[] args) {
        // Test case: 1
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("No. of nodes in binary tree = " + Solution.countNodes(root));

        // Test case 2:
        root = null;
        System.out.println("No. of nodes in binary tree = " + Solution.countNodes(root));

        // Test case 3:
        root = new TreeNode(1);
        System.out.println("No. of nodes in binary tree = " + Solution.countNodes(root));

    }
}
