import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Approach1 {

    public static List<Integer> getUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int num : arr1)
            hs.add(num);

        for (int num : arr2)
            hs.add(num);

        union.addAll(hs);

        return union;
    }
}
