import java.util.Arrays;

public class SortByParity {

        public static int[] sortArrayByParity(int[] nums) {

        int i=0;
        int j=nums.length-1;

        while(i<j)
        {
            while(i<j && nums[i]%2 == 0)i++;
            while(i<j && nums[j]%2 != 0)j--;

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }

        
        return nums;
    }

    public static void main(String[] args) {

        int arr[]={3,1,2,4};
        int ans[]=sortArrayByParity(arr);

        System.out.println("Solved Array : "+Arrays.toString(ans));
        
    }
    
}
