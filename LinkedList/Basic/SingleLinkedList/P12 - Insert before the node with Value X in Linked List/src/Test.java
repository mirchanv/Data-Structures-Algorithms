import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));
        System.out.println("LinkedList = " + Solution.printLinkedList(head));

        head = Solution.insertBefore(head, 3, 10);
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
    }
}
