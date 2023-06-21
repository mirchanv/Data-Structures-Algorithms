import java.util.HashSet;

public class Approach1 {

    // Time Complexity  : O(nlogn) + O(n)
    // Space Complexity : O(n)
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int idx = 0;

        // Time complexity to add elements to hs O(nlogn)
        for (int num : arr)
            hs.add(num);

        // Time complexity to add elements to arr O(n)
        for (int num : hs)
            arr[idx++] = num;

        return hs.size();
    }
}
