package Codes;
public class SearchElement {

    static int search(int arr[],int num,int i)
    {
        if(i==arr.length)return -1;

        if(arr[i]==num)return i;

        return search(arr, num, i+1);
    }
    public static void main(String[] args) {
        
        int arr[]={12,2,3,4,5,6,7,67,7};

        System.out.println("Element present in array at index : "+search(arr, 5, 0));
    }
}
