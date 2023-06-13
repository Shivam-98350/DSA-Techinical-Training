public class JosephusProblem {
    
    static int jose(int n,int k)
    {
        if(n==1)return 1;

        return (jose(n-1,k)+k-1)%n+1;
    }

    public static void main(String[] args) {

        System.out.println("Last Remaining Will be : "+jose(9,2));
        
    }
}
