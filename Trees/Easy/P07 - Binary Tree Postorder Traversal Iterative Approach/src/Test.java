public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.left.right = new TreeNode(7);
        root.right.left.right.right = new TreeNode(8);

        System.out.println("Post order traversal of binary tree = " + Solution.postorder(root));
    }
}
