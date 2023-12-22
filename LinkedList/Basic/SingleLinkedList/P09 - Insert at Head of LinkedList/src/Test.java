import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {12, 53, 11, 28};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));

        System.out.println("\nLinkedList before insertion of 4 at head = " + Solution.printLinkedList(head));
        head = Solution.insertAtHead(head, 4);
        System.out.println("LinkedList after insertion of 4 at head = " + Solution.printLinkedList(head));

        head = null;
        System.out.println("\nLinkedList before insertion of 555 at head = " + Solution.printLinkedList(head));
        head = Solution.insertAtHead(head, 555);
        System.out.println("LinkedList after insertion of 555 at head = " + Solution.printLinkedList(head));
    }
}
