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
            System.out.println("LinkedList is empty!");
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

    // Time Complexity : O(n) for the worst case where the element is placed as the last node
    // Time Complexity : O(1) for the best case if the element is the first node itself
    public static boolean search(Node head, int key) {
        if (head == null) return false;

        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == key)
                return true;

            currNode = currNode.next;
        }
        return false;
    }
}
