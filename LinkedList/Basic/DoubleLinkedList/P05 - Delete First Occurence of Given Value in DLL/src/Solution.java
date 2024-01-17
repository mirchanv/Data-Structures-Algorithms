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

    public static Node deleteByValue(Node head, int val) {
        if (head == null) return null;
        if (head.data == val) {
            if (head.next != null) {
                Node newHead = head.next;
                head.next = null;
                newHead.prev = null;
                return newHead;
            }
            return null;
        }

        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == val) {
                Node next = currNode.next;
                Node prev = currNode.prev;
                currNode.prev = null;
                currNode.next = null;
                prev.next = next;

                if (next != null) {
                    next.prev = prev;
                }
            }
            currNode = currNode.next;
        }

        return head;
    }
}
