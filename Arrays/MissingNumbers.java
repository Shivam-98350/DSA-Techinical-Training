// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class MissingNumbers {

    public static int missingNumber(int[] nums) {

         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums.length)continue;
            if(nums[i]!=i)
            {
                int temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
                i--;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)return i;
        }
        
        return nums.length;
    }
    
    public static void main(String[] args) {

        int arr[]={9,6,4,2,3,5,7,0,1};

        System.out.println("Missing number in array is : "+missingNumber(arr));
        
    }
}
