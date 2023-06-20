import java.util.*;

public class PermutationArray {

    public static List<List<Integer>> permute(int[] nums) {
        
         if(0==nums.length)
        {
            List<List<Integer>> result=new ArrayList<>();
            List<Integer> ds=new ArrayList<>();
            result.add(ds);
            return result;
        }
        
        List<List<Integer>> result=permute(Arrays.copyOfRange(nums, 1, nums.length));

         List<List<Integer>> ans=new ArrayList<>();

         for(List<Integer> str:result)
         {
             for(int i=0;i<=str.size();i++)
             {
                 List<Integer> temp=new ArrayList<>(str);
                 temp.add(i,nums[0]);
                 ans.add(temp);
             }
         }

         return ans;
    }

    public static void main(String[] args) {

        List<List<Integer>> ans=permute(new int[]{1,2,3,4,5,6});
        System.out.println("No of Permutation possible :"+ans.size());
        System.out.println("All permutation of the Array is : "+ans);
    }
}
