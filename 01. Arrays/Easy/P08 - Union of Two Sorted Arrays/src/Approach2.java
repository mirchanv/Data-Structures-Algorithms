import java.util.ArrayList;
import java.util.List;

public class Approach2 {

    // Time complexity  : O(N+M) where N and M are sizes of arr1 and arr2
    // Space Complexity : O(N+M) in worst case if all elements are distinct
    public static List<Integer> getUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] != arr2[j]) {
                if (arr1[i] < arr2[j])
                    addToUnion(union, arr1[i++]);
                else
                    addToUnion(union, arr2[j++]);
            } else {
                addToUnion(union, arr1[i++]);
                j++;
            }
        }

        while (i < arr1.length)
            addToUnion(union, arr1[i++]);

        while (j < arr2.length)
            addToUnion(union, arr2[j++]);

        return union;
    }

    private static void addToUnion(List<Integer> list, int num) {
        if (!list.contains(num))
            list.add(num);
    }
}
