public class Test {
    public static void main(String[] args) {
        // TEST CASE 1:
        String str1 = "aa";
        String p1 = "a";

        System.out.println("str = " + str1 + "\npattern = " + p1);

        // solution using recursion
        System.out.println("matching = " + Solution_Recursion.isMatch(str1, p1));
        // solution using memoization
        System.out.println("matching = " + Solution_Memoization.isMatch(str1, p1));
        // solution using tabulation
        System.out.println("matching = " + Solution_Tabulation.isMatch(str1, p1) + "\n");

        // TEST CASE 2:
        String str2 = "aa";
        String p2 = "*";

        System.out.println("str = " + str2 + "\npattern = " + p2);

        // solution using recursion
        System.out.println("matching = " + Solution_Recursion.isMatch(str2, p2));
        // solution using memoization
        System.out.println("matching = " + Solution_Memoization.isMatch(str2, p2));
        // solution using tabulation
        System.out.println("matching = " + Solution_Tabulation.isMatch(str2, p2) + "\n");

        // TEST CASE 3:
        String str3 = "ray";
        String p3 = "?ay";

        System.out.println("str = " + str3 + "\npattern = " + p3);

        // solution using recursion
        System.out.println("matching = " + Solution_Recursion.isMatch(str3, p3));
        // solution using memoization
        System.out.println("matching = " + Solution_Memoization.isMatch(str3, p3));
        // solution using tabulation
        System.out.println("matching = " + Solution_Tabulation.isMatch(str3, p3));
    }
}
