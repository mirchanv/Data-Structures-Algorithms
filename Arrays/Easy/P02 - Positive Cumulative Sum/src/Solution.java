import java.util.ArrayList;
import java.util.List;

public class Solution {

    // Time Complexity : O(n)
    public static List<Integer> getPositiveCumulativeSum(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 0)
                ans.add(sum);
        }
        return ans;
    }
}
