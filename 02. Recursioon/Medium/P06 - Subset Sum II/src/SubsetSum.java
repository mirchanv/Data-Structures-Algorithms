import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {

    private static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> subsetsWithoutDups(int[] nums) {
        if (nums.length > 0) {
            Arrays.sort(nums);
            generateSubsets(nums, 0, new ArrayList<Integer>());
        }
        return ans;
    }

    private static void generateSubsets(int[] arr, int index, ArrayList<Integer> list) {
        ans.add(new ArrayList<>(list));
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i-1]) continue;

            list.add(arr[i]);
            generateSubsets(arr, i+1, list);
            list.remove(list.size()-1);
        }
    }
}
