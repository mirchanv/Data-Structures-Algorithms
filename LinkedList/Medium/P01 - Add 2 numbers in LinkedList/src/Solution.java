public class Solution {

    public static String print(Node head) {
        if (head == null) return "[]";

        StringBuilder linkedList = new StringBuilder("[");
        Node currNode = head;
        while (currNode != null) {
            if (currNode.next != null) {
                linkedList.append(currNode.data).append(" -> ");
            } else {
                linkedList.append(currNode.data).append("]");
            }
            currNode = currNode.next;
        }

        return linkedList.toString();
    }

    // Time Complexity  : O(max(n1, n2)) where n1 and n2 are the length or no. of nodes in linkedlist1 and linkedlist2 respectively
    // Space Complexity : O(max(n1, n2)) to store result
    public static Node addNumbers(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1);
        Node currNode = dummyNode;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;

            if (temp1 != null) sum += temp1.data;
            if (temp2 != null) sum += temp2.data;

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            currNode.next = newNode;
            currNode = currNode.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        if (carry != 0) {
            Node newNode = new Node(carry);
            currNode.next = newNode;
        }

        return dummyNode.next;
    }
}
