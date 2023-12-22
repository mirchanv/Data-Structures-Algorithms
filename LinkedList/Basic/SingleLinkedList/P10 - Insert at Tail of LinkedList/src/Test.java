import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {12, 53, 11, 28};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));

        System.out.println("\nLinkedList before insertion of 4 at tail = " + Solution.printLinkedList(head));
        head = Solution.insertAtTail(head, 4);
        System.out.println("LinkedList after insertion of 4 at tail = " + Solution.printLinkedList(head));

        head = null;
        System.out.println("\nLinkedList before insertion of 99 at tail = " + Solution.printLinkedList(head));
        head = Solution.insertAtTail(head, 99);
        System.out.println("LinkedList after insertion of 99 at tail = " + Solution.printLinkedList(head));
    }
}
