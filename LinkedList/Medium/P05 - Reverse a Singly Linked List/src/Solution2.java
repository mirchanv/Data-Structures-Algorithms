public class Solution2 {

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

    // Time Complexity  : O(n) as we are going through all nodes
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

    // Time Complexity  : O(n) as we are going through all nodes
    // Space Complexity : O(1) no extra space is being used
    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node currNode = head;
        Node back = null;

        while (currNode != null) {
            Node front = currNode.next;
            currNode.next = back;
            back = currNode;
            currNode = front;
        }

        return back;
    }
}
