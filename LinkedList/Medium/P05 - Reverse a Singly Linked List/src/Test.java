public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = Solution2.convertArrayToLinkedList(arr);
        System.out.println("Original LinkedList = " + Solution2.print(head));

        head = Solution2.reverse(head);
        System.out.println("Reversed LinkedList = " + Solution2.print(head));
    }
}
