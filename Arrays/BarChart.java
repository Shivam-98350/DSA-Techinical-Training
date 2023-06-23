import java.util.Arrays;

public class BarChart {

    public static void barchart(int arr[])
    {
        int max=Arrays.stream(arr).max().getAsInt();

        for(int i=max;i>=1;i--)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<i)
                {
                    System.out.print(" \t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
        for(int x:arr)
        {
            System.out.print(x+"\t");
        }
    }
    public static void main(String[] args) {
        int nums[] = {7,11,15,2,3,4};
        barchart(nums);
    }
}
