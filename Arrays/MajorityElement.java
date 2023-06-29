import java.util.*;

public class MajorityElement {

    public static int majoriy(int arr[])
    {
        int count=0;
        int element=0;

        for(int x:arr)
        {
            if(count==0)
            {
                element=x;
            }
            if(x==element)
            {
                count++;
            }
            else{
                count--;
            }

        }

        return element;
    }

    public static int majorhashmap(int arr[])
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)==arr.length/2)return x;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,3,3,3,3,3,6,6,6,7};

        System.out.println("Majority Element is : "+majoriy(arr));
        System.out.println("Majority Element is : "+majorhashmap(arr));
        
    }
    
}
