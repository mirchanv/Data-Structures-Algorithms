import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    private static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length > 0) {
            Arrays.sort(candidates);
            getCombinations(candidates, target, 0, new ArrayList<>());
        }

        return ans;
    }

    private static void getCombinations(int[] arr, int target, int index, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i != index && arr[i] == arr[i-1]) continue;
            if (arr[index] > target) continue;

            list.add(arr[i]);
            getCombinations(arr, target - arr[i], i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
