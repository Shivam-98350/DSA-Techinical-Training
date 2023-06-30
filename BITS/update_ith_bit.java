
public class update_ith_bit {

         public static void main(String[] args) {
        int n=32;
        int k=2;
        int bit=1;//bit to be updated with
        int mask=~(1<<k);

        
        int clear_num=(n&mask);

        mask=(bit<<k);

        System.out.println((clear_num|mask));
    }
    
}
