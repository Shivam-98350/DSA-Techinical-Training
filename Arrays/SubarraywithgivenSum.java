import java.util.*;

public class SubarraywithgivenSum {

    public static int[] maxsum(int arr[], int sum) {
        int k = 0;
        int presum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum == presum)
                return Arrays.copyOfRange(arr, k, i);

            presum += arr[i];

            while (k < i && sum < presum) {
                presum -= arr[k++];
            }

        }

        return Arrays.copyOfRange(arr, 0, 0);
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int k = 100;

        System.out.println(Arrays.toString(maxsum(arr, k)));

    }

}
