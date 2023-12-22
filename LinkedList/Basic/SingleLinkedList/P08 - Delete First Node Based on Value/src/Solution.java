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

    // Time Complexity : O(n) in the worst case if the value is not present or is the last element in the LinkedList
    public static Node deleteByValue(Node head, int val) {
        if (head == null) return null;
        if (head.data == val) return head.next;

        Node currNode = head;
        Node prev = null;
        while (currNode != null) {
            if (currNode.data == val) {
                prev.next = currNode.next;
                return head;
            }
            prev = currNode;
            currNode = currNode.next;
        }
        return head;
    }
}
