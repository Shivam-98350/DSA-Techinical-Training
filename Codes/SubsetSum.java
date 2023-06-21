public class SubsetSum {

    public static boolean isSubset(int i, int arr[], int sum) {
        if (sum == 0)
            return true;
        if (i == 0)
            return false;

        if (arr[i - 1] <= sum) {
            return isSubset(i - 1, arr, sum - arr[i - 1]) || isSubset(i - 1, arr, sum);
        } else {
            return isSubset(i - 1, arr, sum);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 10;

        System.out.println("Possibility of subsest is : " + isSubset(arr.length - 1, arr, sum));
    }

}
