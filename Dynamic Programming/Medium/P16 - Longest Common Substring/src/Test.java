public class Test {
    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "acdghrx";

        System.out.println("str1 = " + s1);
        System.out.println("str2 = " + s2);
        System.out.println("Longest Common Substring (LCS) = " + Solution.lcs(s1, s2));
    }
}
