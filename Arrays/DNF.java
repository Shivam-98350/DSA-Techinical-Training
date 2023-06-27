import java.util.Arrays;

public class DNF {

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 2, 0, 2, 1, 0, 1, 2, 0, 2 };

        int low = 0, high = arr.length - 1, mid = 0;

        while (low <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
            } else if (arr[mid] == 1) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                mid++;
            }

        }

        System.out.println("Array after Soerting" + Arrays.toString(arr));
    }

}
