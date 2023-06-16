import java.io.*;
import java.util.*;

public class perfectNumberinRange {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}

class Solution {

    public ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        recur(1, n, ans);
        return ans;
    }

    public void recur(int current, int n, ArrayList<Integer> ans) {
        if (current > n) {
            return;
        }

        if (isPerfect(current, 1, 0)) {
            ans.add(current);
        }

        recur(current + 1, n, ans);
    }

    public boolean isPerfect(int number, int divisor, int sum) {
        if (divisor > number / 2) {
            return sum == number;
        }

        if (number % divisor == 0) {
            sum += divisor;
        }

        return isPerfect(number, divisor + 1, sum);
    }
}
