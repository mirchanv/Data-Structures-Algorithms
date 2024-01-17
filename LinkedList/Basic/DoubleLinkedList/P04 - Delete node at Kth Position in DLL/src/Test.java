import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution.convert(arr);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("LinkedList = " + Solution.print(head) + "\n");

        int k = 3;
        System.out.println("LinkedList before removal of node no." + k + " = " + Solution.print(head));
        head = Solution.deleteAt(head, k);
        System.out.println("LinkedList after removal of ." + k + " = " + Solution.print(head));
    }
}
