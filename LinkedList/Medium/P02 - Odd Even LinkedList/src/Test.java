public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = Solution.convertArrayToLinkedList(arr);

        System.out.println("LinkedList before = " + Solution.print(head));
        head = Solution.getOddEvenLinkedList(head);
        System.out.println("LinkedList after = " + Solution.print(head));

    }
}
