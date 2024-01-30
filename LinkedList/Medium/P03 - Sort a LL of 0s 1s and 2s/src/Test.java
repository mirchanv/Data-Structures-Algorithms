import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 0, 0, 1};

        System.out.println("Array = " + Arrays.toString(arr));

        Node head = Solution2.convertArrayToLinkedList(arr);
        System.out.println("LinkedList before = " + Solution2.print(head));

        head = Solution2.sort(head);
        System.out.println("LinkedList after = " + Solution2.print(head));
    }
}
