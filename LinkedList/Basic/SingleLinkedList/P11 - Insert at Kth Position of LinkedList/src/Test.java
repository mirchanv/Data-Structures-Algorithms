import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8, 13};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
        System.out.println("Length of LinkedList = " + Solution.getLength(head) + "\n");

        head = Solution.insertAt(head, 99, 1);
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
        System.out.println("Length of LinkedList = " + Solution.getLength(head) + "\n");

        head = Solution.insertAt(head, 88, 7);
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
        System.out.println("Length of LinkedList = " + Solution.getLength(head) + "\n");

        head = Solution.insertAt(head, 555, 3);
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
        System.out.println("Length of LinkedList = " + Solution.getLength(head) + "\n");

        head = null;
        head = Solution.insertAt(head, 111, 1);
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
        System.out.println("Length of LinkedList = " + Solution.getLength(head));

    }
}
