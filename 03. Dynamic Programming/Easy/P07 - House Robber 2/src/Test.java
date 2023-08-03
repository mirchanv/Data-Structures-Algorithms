import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] valueInHouse = {2,3,2};
        System.out.println("valueInHouse = " + Arrays.toString(valueInHouse));
        System.out.println("Maximum sum we can rob = " + HouseRobber_Recursion.rob(valueInHouse));

        System.out.println("valueInHouse = " + Arrays.toString(valueInHouse));
        System.out.println("Maximum sum we can rob = " + HouseRobber_Memoization.rob(valueInHouse));
    }
}
