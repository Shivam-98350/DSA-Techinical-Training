public class SameNumberWhenAnd {

    public static void main(String[] args) {

        int n=5;
        int count=0;

        for(int i=0;i<=n;i++)
        {
            if((n&i)==i)
            {
                count++;
            }
        }

        System.out.println("Number which give same number when and with the number : "+count);
        
    }
    
}
