import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combos = new ArrayList<>();
        if (candidates.length > 0)
            generateCombinations(candidates, target, 0, combos);

        return ans;
    }

    private static void generateCombinations(int[] arr, int target, int index, List<Integer> combos) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(combos));
            }
            return;
        }

        if (arr[index] <= target) {
            combos.add(arr[index]);
            generateCombinations(arr, target-arr[index], index, combos);
            combos.remove(combos.size()-1);
        }

        generateCombinations(arr, target, index+1, combos);
    }
}
