import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array = " + Arrays.toString(arr));

        Node head = Solution2.convertArrayToLinkedList(arr);
        System.out.println("LinkedList before: " + Solution2.print(head));

        int nodeToDelete = 2;
        System.out.println("Attempting to delete node: " + nodeToDelete + " from end!");
        head = Solution2.removeNthFromEnd(head, nodeToDelete);
        System.out.println("LinkedList after: " + Solution2.print(head));

    }
}
