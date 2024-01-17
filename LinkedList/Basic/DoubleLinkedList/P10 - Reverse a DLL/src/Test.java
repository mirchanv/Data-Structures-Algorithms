import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution1.convert(arr);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("LinkedList = " + Solution1.print(head) + "\n");

        head = Solution2.reverse(head);
        System.out.println("LinkedList after reversal = " + Solution2.print(head));
    }
}
