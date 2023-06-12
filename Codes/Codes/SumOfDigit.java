package Codes;


public class SumOfDigit {

    static int sumUsingLoop(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }

        return sum;
    }

    static int sumUsingRec(int n,int sum)
    {
        if(n==0)return sum;

        sum+=n%10;
        n=n/10;

        return sumUsingRec(n, sum);
    }

    public static void main(String[] args) {
        
        System.out.println("Sum of Digit Using the loop : "+sumUsingLoop(1545));
        System.out.println("Sum of Digit Using the Recursion : "+sumUsingRec(1545,0));
    }
}
