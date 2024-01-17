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

    public static Node insertBefore(Node head, int newNodeValue, int beforeNode) {
        Node newNode = new Node(newNodeValue);

        if (head == null) return null;
        if (beforeNode == head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == beforeNode) {
                Node prev = currNode.prev;
                prev.next = newNode;
                newNode.prev = prev;
                newNode.next = currNode;
                currNode.prev = newNode;
            }
            currNode = currNode.next;
        }

        return head;
    }
}
