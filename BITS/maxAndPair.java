public class maxAndPair {

    public static int maxAnd(int arr[]) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ans = Math.max(ans, (arr[i] & arr[j]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 8, 10, 12 };

        System.out.println("Maximum BIT Wise AND is " + maxAnd(arr));

    }

}
