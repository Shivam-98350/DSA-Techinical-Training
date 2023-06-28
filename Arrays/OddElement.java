public class OddElement {

    public static int Oddelement(int[] nums) {
        

        for(int i=0;i<nums.length-1;i=i+2)
        {
            if((int)(nums[i]^nums[i+1]) != 0)
            {
                return nums[i];
            }
        }
        
        
        return nums[nums.length-1];
        
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};

        System.out.println("Odd Element in the array is : "+Oddelement(arr));
        
    }
    
}
