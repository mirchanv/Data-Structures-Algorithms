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
        if (head == null) return "[]";

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

    // Time Complexity : O(k) as we have to travel to the kth element to delete that node
    public static Node deleteKthElement(Node head, int k) {
        if (head == null) return null;
        if (k == 1) return head.next;

        Node currNode = head;
        Node prev = null;
        int counter = 0;
        while (currNode != null) {
            counter++;
            if (counter == k) {
                prev.next = currNode.next;
                return head;
            }
            prev = currNode;
            currNode = currNode.next;
        }
        return head;
    }
}
