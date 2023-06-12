
public class IsArraySorted {
    
    static boolean isSorted(int arr[] ,int index)
    {
        if(arr.length-1==index)return true;

        if(arr[index]>arr[index+1])return false;

        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        
        int arr[]={2,3,4,5,6,9,10};

        System.out.println("Is Array Sorted : "+isSorted(arr, 0));

    }
}
