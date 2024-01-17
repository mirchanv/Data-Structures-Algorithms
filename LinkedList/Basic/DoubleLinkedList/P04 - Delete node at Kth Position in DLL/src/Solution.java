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

    public static Node deleteAt(Node head, int k) {
        if (head == null) return null;
        if (k == 1) {
            if (head.next != null) {
                Node newHead = head.next;
                head.next = null;
                newHead.prev = null;
                head = newHead;
                return head;
            } else {
                return null;
            }
        }

        Node currNode = head;
        int count = 0;
        while (currNode != null) {
            count++;
            if (count == k) {
                Node prevNode = currNode.prev;
                Node nextNode = currNode.next;
                currNode.prev = null;
                currNode.next = null;
                prevNode.next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }
            }
            currNode = currNode.next;
        }
        return head;
    }
}
