import java.util.*;

public class SmallerNumber {

    public static int[] approach_1(int arr[]) {
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }

            ans[i] = count;
        }

        return ans;
    }

    public static int[] approach_2(int arr[]) 
    {
        int ans[] = new int[arr.length];
        int org[]=arr.clone();
        Arrays.sort(arr);

        Map<Integer,Integer> map =new HashMap<>();

        for (int i = 0; i < arr.length; i++) 
        {
            map.putIfAbsent(arr[i],i);
        }

        for (int i = 0; i < arr.length; i++) 
        {
           ans[i] =map.get(org[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[]={8,1,2,2,3};

        System.out.println(Arrays.toString(approach_1(arr)));
        System.out.println(Arrays.toString(approach_2(arr)));

    }

}
