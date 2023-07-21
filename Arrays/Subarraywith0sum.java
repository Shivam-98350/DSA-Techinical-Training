import java.util.*;
import java.lang.*;
import java.io.*;

class Subarraywith0sum {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution().findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
class Solution{
    static boolean findsum(int arr[],int n)
    {
      //solution goes here  
	  int sum=0;
	  Set<Integer> st = new HashSet<>();


	  for(int i=0;i<n;i++)
	  {
		  sum+=arr[i];

		  if(sum==0 || arr[i]==0 || st.contains(sum))return true;

		st.add(sum);
	  }


	return false;
    }
}