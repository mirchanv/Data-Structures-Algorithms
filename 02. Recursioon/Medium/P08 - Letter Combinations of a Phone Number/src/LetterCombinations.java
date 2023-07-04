import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] keypad = new String[10];
        keypad[2] = "abc";
        keypad[3] = "def";
        keypad[4] = "ghi";
        keypad[5] = "jkl";
        keypad[6] = "mno";
        keypad[7] = "pqrs";
        keypad[8] = "tuv";
        keypad[9] = "wxyz";

        if (digits.length() > 0)
            solve(digits, 0, keypad, new StringBuilder(), ans);

        return ans;
    }

    private static void solve(String digits, int index, String[] keypad, StringBuilder sb, List<String> ans) {
        if (sb.length() == digits.length()) {
            ans.add(new String(sb));
            return;
        }

        String currDigit = keypad[Character.getNumericValue(digits.charAt(index))];
        for (int i = 0; i < currDigit.length(); i++) {
            sb.append(currDigit.charAt(i));
            solve(digits, index + 1, keypad, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
