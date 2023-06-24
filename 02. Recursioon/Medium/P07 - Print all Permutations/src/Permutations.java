import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private static List<List<Integer>> permutations = new ArrayList<>();

    public static List<List<Integer>> printAllPermutations(int[] arr) {
        if (arr.length > 0) {
            boolean[] taken = new boolean[arr.length];
            helper(arr, new ArrayList<>(), taken);
        }
        return permutations;
    }

    private static void helper(int[] arr, List<Integer> myList, boolean[] taken) {
        if (myList.size() == arr.length) {
            permutations.add(new ArrayList<>(myList));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (taken[i]) continue;

            // pick
            myList.add(arr[i]);
            taken[i] = true;
            helper(arr, myList, taken);

            // back-tracking settings for caller
            myList.remove(myList.size()-1);
            taken[i] = false;
        }
    }
}
