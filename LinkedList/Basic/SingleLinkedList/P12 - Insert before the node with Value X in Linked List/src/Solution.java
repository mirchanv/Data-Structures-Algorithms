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

    public static Node insertBefore(Node head, int beforeValue, int newElement) {
        Node newNode = new Node(newElement);
        if (head == null) return head;
        if (head.data == beforeValue) {
            System.out.println("Inserting: " + newElement + " to the LinkedList!");
            newNode.next = head;
            return newNode;
        }

        Node currNode = head;
        Node prevNode = null;

        while (currNode != null) {
            if (currNode.data == beforeValue) {
                System.out.println("Inserting: " + newElement + " to the LinkedList!");
                newNode.next = prevNode.next;
                prevNode.next = newNode;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
        return head;
    }
}
