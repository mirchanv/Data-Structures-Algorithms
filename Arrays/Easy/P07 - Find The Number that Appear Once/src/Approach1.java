import java.util.HashMap;
import java.util.Map;

public class Approach1 {

    // Time Complexity  : O(N) + O(M) where N is size of array and M is size of map
    // Space Complexity : O(M) extra space used as we are using map data structure
    public static int findNumberAppearingOnce(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // TC: O(N) inserting all elements of array into map
        for (int currNum : arr) {
            if (hm.containsKey(currNum))
                hm.put(currNum, hm.get(currNum) + 1);
            else
                hm.put(currNum, 1);
        }

        // TC: O(M) going through all elements of map
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return -1;
    }
}
