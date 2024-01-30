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

    // Time Complexity  : O(2n) as we are going through the linked 2 times
    // Space Complexity : O(1) no extra space is being used
    public static Node sort(Node head) {
        if (head == null || head.next == null) return head;

        Node currNode = head;
        int zeros = 0;
        int ones = 0;

        while (currNode != null) {
            if (currNode.data == 0) zeros++;
            else if (currNode.data == 1) ones++;
            currNode = currNode.next;
        }

        currNode = head;
        while (currNode != null) {
            if (zeros > 0) {
                currNode.data = 0;
                zeros--;
            } else if (ones > 0) {
                currNode.data = 1;
                ones--;
            } else
                currNode.data = 2;

            currNode = currNode.next;
        }

        return head;
    }
}
