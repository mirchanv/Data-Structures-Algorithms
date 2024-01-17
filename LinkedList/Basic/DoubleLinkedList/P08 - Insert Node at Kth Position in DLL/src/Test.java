import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution.convert(arr);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Doubly LinkedList = " + Solution.print(head) + "\n");

        System.out.println("DLL before = " + Solution.print(head));
        head = Solution.insertBefore(head, 99, 2);
        System.out.println("DLL after = " + Solution.print(head));
    }
}
