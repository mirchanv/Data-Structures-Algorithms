import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {12, 53, 11, 28};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));

        System.out.println("\nLinkedList Before Removal 2nd Element = " + Solution.printLinkedList(head));
        head = Solution.deleteKthElement(head, 2);
        System.out.println("LinkedList After Removal of 2nd Element = " + Solution.printLinkedList(head));

        System.out.println("\nLinkedList Before Removal of 3rd Element = " + Solution.printLinkedList(head));
        head = Solution.deleteKthElement(head, 3);
        System.out.println("LinkedList After Removal of 3rd Element = " + Solution.printLinkedList(head));
    }
}
