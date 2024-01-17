public class Solution {

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

    public static Node insertBeforeTail(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) return null;
        if (head.next == null) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        Node prev = currNode.prev;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = currNode;
        currNode.prev = newNode;

        return head;
    }
}
