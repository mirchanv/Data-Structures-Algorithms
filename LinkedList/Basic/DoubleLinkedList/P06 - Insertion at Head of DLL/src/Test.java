import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution.convert(arr);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("LinkedList = " + Solution.print(head) + "\n");

        System.out.println("LinkedList before insertion at head = " + Solution.print(head));
        head = Solution.insertAtHead(head, 99);
        System.out.println("LinkedList after insertion at head = " + Solution.print(head));
    }
}
