import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

    public static ArrayList<Integer> ans = new ArrayList<>();

    public static ArrayList<Integer> subsetSum(int[] nums) {
        if (nums.length > 0)
            getAllSubsetSums(nums, 0, 0);

        Collections.sort(ans);
        return ans;
    }

    public static void getAllSubsetSums(int[] arr, int index, int sum) {
        if (index == arr.length) {
            ans.add(sum);
            return;
        }

        // pick element
        getAllSubsetSums(arr, index+1, sum+arr[index]);

        // not pick element
        getAllSubsetSums(arr, index+1, sum);
    }
}
