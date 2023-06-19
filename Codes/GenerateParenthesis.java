import java.util.*;

public class GenerateParenthesis {

    public static void recur(String s, int open, int close, int n, ArrayList<String> ans) {
        // System.out.println(s);
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n)
            recur(s + '(', open + 1, close, n, ans);
        if (close < open)
            recur(s + ')', open, close + 1, n, ans);

        return;
    }

    public static void main(String[] args) {

        ArrayList<String> ans = new ArrayList<>();
        recur("", 0, 0, 4, ans);
        System.out.println("All Combination are : " + ans);
    }
}
