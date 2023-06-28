// works only when arr1 >= arr2
import java.util.Arrays;

public class ArraySubtraction {

public static void main(String[] args) {
    int arr1[] = {8, 9, 7, 8 };
    int arr2[] = {7, 1, 2, 9 };

    System.out.println("Subtraction of the Array is : "+Arrays.toString(subArray(arr1,arr2)));
}

private static int[] subArray(int[] arr1, int[] arr2) {
    
    int i=arr1.length-1;
    int j=arr2.length-1;

    int borrow=0;

    int k=Math.max(j, i);
    int ans[]=new int[k+1];

    while(i>=0 && j>=0)
    {
        int rsub=(borrow+arr1[i--])-arr2[j--];
        if(rsub<0)
        {
            borrow=-1;
            rsub+=10;
        }
        else
        {
            borrow=0;
        }
        ans[k--]=rsub;
    }
    while(j>=0)
    {
        int rsub=0-arr2[j--];
        if(rsub<0)
        {
            borrow=-1;
            rsub+=10;
        }
        ans[k--]=rsub;
    }
    while(i>=0)
    {
        int rsub=(borrow+arr1[i--]);
        if(rsub<0)
        {
            borrow=-1;
            rsub+=10;
        }
        ans[k--]=rsub;
    }



    return ans;
}

}
