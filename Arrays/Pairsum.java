import java.util.*;

public class Pairsum {

    public static void approach_1(int nums[],int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }

    public static void approach_2(int nums[],int target)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:nums)
        {
            if(map.get(x)==null)
            {
                map.put(target-x,x);
            }
            else
            {
                System.out.println(map.get(x)+" "+x);
                return;
            }
        }
    }

    public static void approach_3(int nums[],int target)
    {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(target == (nums[i]+nums[j]))
            {
                System.out.println(nums[i]+" "+nums[j]);
                return;
            }
            else if(target>(nums[i]+nums[j]))
            {
                i++;
            }
            else if(target<(nums[i]+nums[j]))
            {
                j--;
            }
            
        }
    }

    public static void main(String[] args) {

        int nums[] = {7,11,15,2};
        int target=26;
        approach_1(nums, target);
        approach_2(nums, target);
        approach_3(nums, target);
    }
    
}
