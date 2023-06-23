import java.util.*;

public class maxElement {

    public static void maxelementstream(int arr[]) {
        int ans = Arrays.stream(arr)
                .max()
                .getAsInt();

        System.out.println("Maximun element using stream : "+ans);
    }

    public static void maxelement(int arr[])
    {
        int max=arr[0];

        for(int x:arr)
        {
            max=Math.max(x, max);
        }

        System.out.println("Maximum element using loop : "+max);

    }

    

    public static void main(String[] args) {
        maxelementstream(new int[]{1,5,3,7,89,33});
        maxelement(new int[]{1,5,3,7,89,33});
    }

}

