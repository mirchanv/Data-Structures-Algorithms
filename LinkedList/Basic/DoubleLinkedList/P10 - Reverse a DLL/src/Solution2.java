public class Solution2 {

    public static Node convert(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    public static String print(Node head) {
        if (head == null) return "[]";

        StringBuilder linkedlist = new StringBuilder("[");
        Node currNode = head;
        while (currNode != null) {
            if (currNode.next != null) {
                linkedlist.append(currNode.data).append(" -> ");
            } else {
                linkedlist.append(currNode.data).append("]");
            }
            currNode = currNode.next;
        }

        return linkedlist.toString();
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(1) no extra space being used
    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node currNode = head;
        Node prevNode = null;

        while (currNode != null) {
            currNode.prev = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = currNode.prev;
        }
        return prevNode;
    }
}
