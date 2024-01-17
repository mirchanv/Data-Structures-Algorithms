import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution.convert(arr);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("LinkedList = " + Solution.print(head) + "\n");

        int val = 4;
        System.out.println("LinkedList before removal of node " + val + " = " + Solution.print(head));
        head = Solution.deleteByValue(head, val);
        System.out.println("LinkedList after removal of node " + val + " = " + Solution.print(head));
    }
}
