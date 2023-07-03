public class PeakElement {

    public static int findPeakElement(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (j - i >= 2) {
            int mid = i + (j - i) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1] && nums[mid + 1] > nums[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }

        return nums[i] < nums[j] ? j : i;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };

        int ans = findPeakElement(arr);

        System.out.println("Peak Element in the array is : " + ans);

    }

}
