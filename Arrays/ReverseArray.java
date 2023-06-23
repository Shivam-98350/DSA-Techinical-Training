import java.util.Arrays;

public class ReverseArray {

    static void reverse(int arr[])
    {
       int i=0;
       int j=arr.length-1;
       while(i<j)
       {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }

    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        System.out.println("Array before Reversing : "+Arrays.toString(arr));
        reverse(arr);

        System.out.println("Array after  Reversing : "+Arrays.toString(arr));
    }
    
}
