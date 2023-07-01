public class MaxSumKConsecutive {

    public static int maxsum(int arr[],int k)
    {
        int ans=0;

        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }

        ans=sum;

        for(int i=k;i<arr.length;i++)
        {
            sum=sum-arr[i-k]+arr[k];
            ans=Math.max(ans, sum);
        }


        return ans;
    }

    public static void main(String[] args) {

        int arr[]={1,40,30,10,20,5};
        int k=3;

        System.out.println(maxsum(arr, k));

        
    }
    
}
