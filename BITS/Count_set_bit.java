
public class Count_set_bit {

    public static void main(String[] args) {
        int n=13;
        int n1=13;
        int count1=0;
        int count2=0;

        while(n>0)
        {
            if((n&1)!=0)count1++;
            n=n>>1;
        }

        while(n1>0)
        {
            count2++;
            n1=n1&(n1-1);
        }

        System.out.println(count1);
        System.out.println(count2);

    }
    
}
