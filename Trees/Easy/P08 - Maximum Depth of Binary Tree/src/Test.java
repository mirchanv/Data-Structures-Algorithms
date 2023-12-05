public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Maximum height/depth of binary tree = " + Solution.maxDepth(root));

        root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);

        System.out.println("Maximum height/depth of binary tree = " + Solution.maxDepth(root));
    }
}
