import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));
        System.out.println("LinkedList = " + Solution.printLinkedList(head));

        System.out.println("Does element: " + 1 + " exist in LinkedList? " + Solution.search(head, 1));
        System.out.println("Does element: " + 2 + " exist in LinkedList? " + Solution.search(head, 2));
        System.out.println("Does element: " + 3 + " exist in LinkedList? " + Solution.search(head, 3));
        System.out.println("Does element: " + 4 + " exist in LinkedList? " + Solution.search(head, 4));
    }
}
