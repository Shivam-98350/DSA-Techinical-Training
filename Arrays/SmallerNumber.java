import java.util.*;

public class SmallerNumber {

    // Naive approach
    public static int[] approach_1(int arr[]) {
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }

            ans[i] = count;
        }

        return ans;
    }

    // using sort and maping
    public static int[] approach_2(int arr[]) {
        int ans[] = new int[arr.length];
        int org[] = arr.clone();
        Arrays.sort(org);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(org[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }

    // using prefix sum and a array of size 100
    public static int[] approach_3(int arr[]) {
        int ans[] = new int[arr.length];
        int presum[] = new int[101];

        for (int i = 0; i < arr.length; i++) {
            presum[arr[i]]++;
        }

        for (int i = 1; i < presum.length; i++) {
            presum[i] += presum[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - 1) >= 0)
                ans[i] = presum[arr[i] - 1];
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 8, 1, 2, 2, 3 };

        System.out.println("Smaller number using approach 1 : " + Arrays.toString(approach_1(arr)));
        System.out.println("Smaller number using approach 2 : " + Arrays.toString(approach_2(arr)));
        System.out.println("Smaller number using approach 3 : " + Arrays.toString(approach_3(arr)));

    }

}
