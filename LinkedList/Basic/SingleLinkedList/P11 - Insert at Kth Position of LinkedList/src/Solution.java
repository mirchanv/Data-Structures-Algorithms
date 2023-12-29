public class Solution {

    // Time Complexity  : O(n) as we are going through all elements in the array
    public static Node convertArrayToLinkedList(int[] nums) {
        if (nums.length == 0) return null;
        Node head = new Node(nums[0]);
        Node currNode = head;

        for (int indx = 1; indx < nums.length; indx++) {
            Node newNode = new Node(nums[indx]);
            currNode.next = newNode;
            currNode = newNode;
        }
        return head;
    }

    // Time Complexity  : O(n) as we are going through all nodes in the LinkedList
    public static String printLinkedList(Node head) {
        if (head == null) {
            return "[]";
        }

        StringBuilder linkedList = new StringBuilder("[");
        Node currNode = head;
        while (currNode != null) {
            if (currNode.next != null)
                linkedList.append(currNode.data + " -> ");
            else
                linkedList.append(currNode.data + "]");

            currNode = currNode.next;
        }
        return linkedList.toString();
    }

    // Time Complexity : O(n) in the worst case if we want to insert at tail
    // Time Complexity : O(1) in the best case if we want to insert at head
    public static Node insertAt(Node head, int val, int k) {
        if (k > getLength(head) + 1 || k <= 0) {
            System.out.println("Invalid position to insert at : " + k);
            return head;
        }

        Node newNode = new Node(val);
        if (k == 1) {
            newNode.next = head;
            System.out.println("Node: " + val + " inserted at position 1");
            return newNode;
        }

        Node currNode = head;
        int count = 0;

        while (currNode != null) {
            count++;
            if (count == k-1) {
                newNode.next = currNode.next;
                currNode.next = newNode;
                System.out.println("Node: " + val + " inserted at position " + k);
                return head;
            }
            currNode = currNode.next;
        }
        return head;
    }

    // Time Complexity  : O(n) as we are going through all nodes in the LinkedList
    public static int getLength(Node head) {
        if (head == null) return 0;

        Node currNode = head;
        int length = 0;

        while (currNode != null) {
            length++;
            currNode = currNode.next;
        }
        return length;
    }
}
