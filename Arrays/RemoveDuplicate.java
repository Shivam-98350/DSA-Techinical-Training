import java.util.Arrays;

public class RemoveDuplicate {

     public static int removeDuplicates(int[] nums) {
        
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
               continue ;
            }
            nums[count]=nums[i];
            count++;
        }
        
        return count;
        
    }

    public static void main(String[] args) {

        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int k=removeDuplicates(arr);

        System.out.println("Arrays without duplicate is : "+Arrays.toString(Arrays.copyOfRange(arr, 0, k)));
        
    }
    
}
