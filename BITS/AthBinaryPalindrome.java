public class AthBinaryPalindrome {

    public static int solve(int A) {
        int prev = 0, ans = 1;
        for (int i = 0; i < 32; i++) {

            long x = (1 << (i / 2));

            if (prev + x >= A) {

                ans |= (1 << i);
                boolean flag = false;

                for (int j = i - 1; j >= (i + 1) / 2; j--) {
                    
                    if (prev + x / 2 >= A && flag != true) {
                        if (prev + x / 2 == A) {
                            flag = true;
                        }
                    } else {
                        ans |= (1 << j);
                        ans |= (1 << (i - j));
                        prev += x / 2;
                    }
                    x /= 2;
                }
                return ans;
            }
            prev += x;
        }
        return ans;
    }

    public static void main(String[] args) {

        int ans = solve(9);
        System.out.println(ans + " " + Integer.toBinaryString(ans));

    }
}
