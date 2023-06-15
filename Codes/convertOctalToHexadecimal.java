import java.io.*;

class Solution {
    public String convert(int n) {
        if (n == 0) {
            return "0";
        } else {
            int decimal = convertToDecimal(n);
            return decimalToHexadecimal(decimal);
        }
    }

    public int convertToDecimal(int octal) {
        if (octal == 0) {
            return 0;
        } else {
            int digit = octal % 10;
            int decimal = digit + 8 * convertToDecimal(octal / 10);
            return decimal;
        }
    }

    public String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            int digit = decimal % 16;
            String hexadecimal = decimalToHexadecimal(decimal / 16);
            if (digit < 10) {
                return hexadecimal + digit;
            } else {
                char ch = (char) ('A' + (digit - 10));
                return hexadecimal + ch;
            }
        }
    }
}

public class convertOctalToHexadecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading octal number
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        String result = solution.convert(n);
        System.out.println(result);
    }
}
