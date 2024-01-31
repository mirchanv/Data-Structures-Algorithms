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

    // Time Complexity  : O(n) as we are only going through the linked list using single pass
    // Space Complexity : O(1) no extra space being used
    public static Node removeNthFromEnd(Node head, int n) {
        if (head == null) return null;

        Node fast = head;
        Node slow = head;

        // moving fast pointer n steps forward in the linked list
        for (int i = 0; i < n; i++)
            fast = fast.next;

        // check if fast == null ? if true then that means the first item needs to be removed
        if (fast == null) return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
