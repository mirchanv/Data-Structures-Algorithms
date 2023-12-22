import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));

        System.out.println("\nLinkedList Before Tail Removal = " + Solution.printLinkedList(head));
        head = Solution.deleteTail(head);
        System.out.println("LinkedList After Tail Removal = " + Solution.printLinkedList(head));

        System.out.println("\nLinkedList Before Tail Removal = " + Solution.printLinkedList(head));
        head = Solution.deleteTail(head);
        System.out.println("LinkedList After Tail Removal = " + Solution.printLinkedList(head));
    }
}
