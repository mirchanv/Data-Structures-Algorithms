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

    // Time Complexity  : O(2n) as we are going through the linked list twice
    // Space Complexity : O(1) no extra space being used
    public static Node removeNthFromEnd(Node head, int n) {
        if (head == null) return null;

        Node currNode = head;
        int totalNodes = 0;
        while (currNode != null) {
            totalNodes++;
            currNode = currNode.next;
        }

        if (totalNodes == n) {
            return head.next;
        }

        currNode = head;
        int count = 0;
        while (currNode != null) {
            count++;
            if (count == totalNodes-n) {
                Node temp = currNode.next;
                currNode.next = temp.next;
                temp.next = null;
                break;
            }
            currNode = currNode.next;
        }
        return head;
    }
}
