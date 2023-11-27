public class Test {

    public static void main(String[] args) {

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println("Same trees : " + Solution.isSameTree(root1, root2));

        // Example 2
        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = null;

        root2 = new TreeNode(1);
        root2.left = null;
        root2.right = new TreeNode(2);

        System.out.println("Same tress : " + Solution.isSameTree(root1, root2));

        // Example 3
        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        System.out.println("Same tress : " + Solution.isSameTree(root1, root2));
    }
}
