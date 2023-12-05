public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println("has a root-to-leaf path equal to targetSum : " + Solution.pathSum(root, 22));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println("has a root-to-leaf path equal to targetSum : " + Solution.pathSum(root, 5));

        root = null;

        System.out.println("has a root-to-leaf path equal to targetSum : " + Solution.pathSum(root, 0));
    }
}
