// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

import java.util.Arrays;
public class RotateAnArray {

    public static void rotate(int arr[],int k)
    {
        k=k%arr.length;

        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        
    }

    

    private static void reverse(int[] arr, int i, int j) {

        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }



    public static void main(String[] args) {
        
        int arr[]={2,3,4,5,6,7,8,9};
        int k=3;

        System.out.println("Intital array is :"+Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Array after Rotating k times to right is :"+Arrays.toString(arr));


    }
    
}
