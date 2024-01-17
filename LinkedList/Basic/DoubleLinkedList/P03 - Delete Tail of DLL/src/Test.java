public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution.convert(arr);

        System.out.println("LinkedList before removal of tail = " + Solution.print(head));
        head = Solution.deleteTail(head);
        System.out.println("LinkedList after removal of tail = " + Solution.print(head));
    }
}
