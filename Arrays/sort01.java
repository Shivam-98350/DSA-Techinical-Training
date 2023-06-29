import java.util.Arrays;

public class sort01 {
    public static void main(String[] args) {

        int arr[]={0,0,1,1,0,1,0,1,0,0,1,1,1};
        sort(arr);

        System.out.println("Sorted Array is : "+Arrays.toString(arr));
        
    }

    private static void sort(int[] arr) {

        int zero=0;

        for(int x:arr)
        {
            if(x==0)zero++;
        }

        Arrays.fill(arr,1);

        for(int i=0;i<zero;i++)
        {
            arr[i]=0;
        }



    }
    
}
