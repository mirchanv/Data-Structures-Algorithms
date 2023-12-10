public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(25);

        System.out.println("Boundary Traversal of binary tree = " + Solution.traverseBoundary(root));

        root = new TreeNode(111);
        root.left = null;
        root.right = null;

        System.out.println("Boundary Traversal of binary tree = " + Solution.traverseBoundary(root));
    }
}
