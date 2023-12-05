import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> triangle1 = List.of(
                List.of(1), List.of(2, 3), List.of(3, 6, 7), List.of(8, 9, 6, 10));

        System.out.println("triangle = " + triangle1);
        System.out.println("Minimum Total = " + Triangle_Recursion.minimumTotal(triangle1));
        System.out.println("Minimum Total = " + Triangle_Memoization.minimumTotal(triangle1));
        System.out.println("Minimum Total = " + Triangle_Tabulation.minimumTotal(triangle1));
        System.out.println("Minimum Total = " + Triangle_TabulationOptimised.minimumTotal(triangle1) + "\n");

        List<List<Integer>> triangle2 = List.of(
                List.of(2), List.of(3, 4), List.of(5, 6, 7), List.of(4, 1, 8, 3));

        System.out.println("triangle = " + triangle2);
        System.out.println("Minimum Total = " + Triangle_Recursion.minimumTotal(triangle2));
        System.out.println("Minimum Total = " + Triangle_Memoization.minimumTotal(triangle2));
        System.out.println("Minimum Total = " + Triangle_Tabulation.minimumTotal(triangle2));
        System.out.println("Minimum Total = " + Triangle_TabulationOptimised.minimumTotal(triangle2));
    }
}
