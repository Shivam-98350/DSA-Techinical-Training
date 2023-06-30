
public class clear_ith_bit {

    public static void main(String[] args) {
        int n=13;
        int k=2;
        int mask=~(1<<k);

        System.out.println((n&mask));
    }
    
}
