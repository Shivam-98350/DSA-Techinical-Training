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

    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,3,3,3,3,3,6,6,6,7};

        System.out.println("Majority Element is : "+majoriy(arr));
        
    }
    
}
