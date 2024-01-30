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

    // Time Complexity  : O(n) as we are only going through the linked list once
    // Space Complexity : O(1) no extra space is being used
    public static Node sort(Node head) {
        if (head == null || head.next == null) return head;

        Node temp = head;
        Node zerosHead = new Node(-1);
        Node zero = zerosHead;
        Node onesHead = new Node(-1);
        Node one = onesHead;
        Node twosHead = new Node(-1);
        Node two = twosHead;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        two.next = null;

        zero.next = (onesHead.next != null) ? onesHead.next : twosHead.next;
        one.next = twosHead.next;

        return zerosHead.next;
    }
}
