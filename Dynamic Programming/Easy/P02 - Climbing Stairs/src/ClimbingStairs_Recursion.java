public class ClimbingStairs_Recursion {

    public static int climbingStairs(int n) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;

        return climbingStairs(n-1) + climbingStairs(n-2);
    }
}
