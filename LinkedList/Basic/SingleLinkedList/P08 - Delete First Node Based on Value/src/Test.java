import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 2, 5};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));

        System.out.println("\nLinkedList Before Removal of 2 = " + Solution.printLinkedList(head));
        head = Solution.deleteByValue(head, 2);
        System.out.println("LinkedList After Removal of 2 = " + Solution.printLinkedList(head));

        System.out.println("\nLinkedList Before Removal of 2 = " + Solution.printLinkedList(head));
        head = Solution.deleteByValue(head, 2);
        System.out.println("LinkedList After Removal of 2 = " + Solution.printLinkedList(head));

        System.out.println("\nLinkedList Before Removal of 5 = " + Solution.printLinkedList(head));
        head = Solution.deleteByValue(head, 5);
        System.out.println("LinkedList After Removal of 5 = " + Solution.printLinkedList(head));

        System.out.println("\nLinkedList Before Removal of 8 = " + Solution.printLinkedList(head));
        head = Solution.deleteByValue(head, 8);
        System.out.println("LinkedList After Removal of 8 = " + Solution.printLinkedList(head));
    }
}
