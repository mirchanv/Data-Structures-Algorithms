import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public static int kthLargestElement(int[] arr, int k) {
        if (k > arr.length)
            return -1;
        else if (k == 0 || arr.length == 0)
            return -1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
            pq.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > pq.peek() && !pq.contains(arr[i])) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static int kthSmallestElement(int[] arr, int k) {
        if (k > arr.length)
            return -1;
        else if (k == 0 || arr.length == 0)
            return -1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++)
            pq.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < pq.peek() && !pq.contains(arr[i])) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
