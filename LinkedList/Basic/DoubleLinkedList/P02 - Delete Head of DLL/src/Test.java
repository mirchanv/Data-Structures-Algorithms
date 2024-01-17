public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        Node head = Solution.convert(arr);

        System.out.println("LinkedList before removal of head = " + Solution.print(head));
        head = Solution.deleteHead(head);
        System.out.println("LinkedList after removal of head = " + Solution.print(head));
    }
}
