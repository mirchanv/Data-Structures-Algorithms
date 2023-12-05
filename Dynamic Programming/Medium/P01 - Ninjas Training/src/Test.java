public class Test {
    public static void main(String[] args) {
        int[][] points = {{10, 50, 1}, {5, 100, 11}};

        // using recursive solution
        System.out.println("Max Merit Points possible : " + NinjaTraining_Recursion.getMaxMeritPts(points.length, points));

        // using memoization
        System.out.println("Max Merit Points possible : " + NinjaTraining_Memoization.getMaxMeritPts(points.length, points));
    }
}
