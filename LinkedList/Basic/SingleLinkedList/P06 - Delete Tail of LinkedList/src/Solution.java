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
            System.out.println("LinkedList is empty, nothing to print!");
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

    // Time Complexity : O(n) as we have to go through all the nodes in order to delete the last/tail node
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }

        currNode.next = null;
        return head;
    }
}
