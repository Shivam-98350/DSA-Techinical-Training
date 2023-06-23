import java.util.Arrays;

public class IsArraySorted {

    public static boolean issorted(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int nums[] = {7,11,15,2,3,4};
        System.out.println(Arrays.toString(nums)+" is Sorted : "+issorted(nums));
    }
    
}
