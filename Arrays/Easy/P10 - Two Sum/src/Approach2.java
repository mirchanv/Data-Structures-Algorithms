import java.util.Arrays;
import java.util.HashMap;

public class Approach2 {

    // Time Complexity  : O(n)
    // Space Complexity : O(n) extra space used for map
    public static boolean pairExists(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int firstElement = arr[i];
            int secondElement = target - firstElement;

            if (hm.containsKey(secondElement))
                return true;

            hm.put(arr[i], i);
        }
        return false;
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(n) extra space used for map
    public static int[] getPair(int[] arr, int target) {
        int[] pair = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.fill(pair, -1);

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int firstElement = arr[i];
            int secondElement = target - firstElement;

            if (hm.containsKey(secondElement)) {
                pair[0] = hm.get(secondElement);
                pair[1] = i;
                return pair;
            }
            hm.put(arr[i], i);
        }
        return pair;
    }
}
