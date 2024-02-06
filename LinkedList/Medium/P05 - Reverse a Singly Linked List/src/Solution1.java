import java.util.Stack;

public class Solution1 {

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

    // Time Complexity  : O(2n) as we are going through all nodes 2 times
    // Space Complexity : O(n) to store all elements in stack
    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Stack<Integer> nums = new Stack<>();
        Node temp = head;
        while (temp != null) {
            nums.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = nums.pop();
            temp = temp.next;
        }

        return head;
    }
}
