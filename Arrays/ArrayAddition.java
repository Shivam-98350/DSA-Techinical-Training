import java.util.Arrays;

public class ArrayAddition {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };
        int arr2[] = { 9, 7, 8 };

        System.out.println("Summation of the arrays are : " + Arrays.toString(sumofArray(arr, arr2)));

    }

    private static int[] sumofArray(int[] arr, int[] arr2) {

        int carry = 0;

        int i = arr.length - 1;
        int j = arr2.length - 1;

        int[] ans = new int[Math.max(i, j) + 2];
        int k = ans.length - 1;

        while (i >= 0 && j >= 0) {
            int rsum = arr[i] + arr2[j];
            ans[k--] = (rsum + carry) % 10;
            carry = (rsum + carry) / 10;
            i--;
            j--;
        }
        while (j >= 0) {
            int rsum = arr2[j];
            ans[k--] = (rsum + carry) / 10;
            carry = (rsum + carry) % 10;
            j--;
        }
        while (i >= 0) {
            int rsum = arr[i];
            ans[k--] = (rsum + carry) / 10;
            carry = (rsum + carry) % 10;
            i--;
        }

        ans[k] = carry;

        return ans;
    }

}
