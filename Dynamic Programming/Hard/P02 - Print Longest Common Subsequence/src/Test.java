public class Test {
    public static void main(String[] args) {
        String s1 = "abcde";
        int n = s1.length();

        String s2 = "bdgek";
        int m = s2.length();

        System.out.println("Longest Common Subsequence is : " + Solution.printLCS(n, m, s1, s2));
    }
}
