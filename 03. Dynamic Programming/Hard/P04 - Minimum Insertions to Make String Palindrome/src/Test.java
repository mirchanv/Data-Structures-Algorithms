public class Test {
    public static void main(String[] args) {
        String s1 = "zzazz";        // already palindrome so 0 insertions needed
        String s2 = "mbadm";        // String can be "mbdadbm" or "mdbabdm". Insertions needed = 2
        String s3 = "leetcode";     // Inserting 5 characters the string becomes "leetcodocteel".

        System.out.println("str = " + s1  + "\nMinimum insertions needed to make it palindrome: " + Solution.minInsertions(s1) + "\n");
        System.out.println("str = " + s2  + "\nMinimum insertions needed to make it palindrome: " + Solution.minInsertions(s2) + "\n");
        System.out.println("str = " + s3  + "\nMinimum insertions needed to make it palindrome: " + Solution.minInsertions(s3));
    }
}
