
public class Get_ith_bit {

    public static void main(String[] args) {
        
        int num=12;
        int k=3;
        int mask=1<<k;

        if((mask&num)>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
    
}
