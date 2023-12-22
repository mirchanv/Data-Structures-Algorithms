import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8, 13};
        Node head = Solution.convertArrayToLinkedList(nums);

        System.out.println("Array = " + Arrays.toString(nums));
        System.out.println("LinkedList = " + Solution.printLinkedList(head));
        System.out.println("Length of LinkedList = " + Solution.getLength(head));
    }
}
