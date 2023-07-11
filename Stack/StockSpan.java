import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {

        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        System.out.println(Arrays.toString(stockspan(price)));
    }

    private static int[] stockspan(int[] price) {

        Stack<Integer> st = new Stack<Integer>();

        int ans[] = new int[price.length];

        for (int i = 0; i < price.length; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = i - st.peek();
            } else {
                ans[i] = 1;
            }

            st.push(i);
        }

        return ans;
    }

}
