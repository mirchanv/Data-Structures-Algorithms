public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        Node head = Solution.convert(arr);

        System.out.println("LinkedList = " + Solution.print(head));
    }
}
