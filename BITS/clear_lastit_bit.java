
public class clear_lastit_bit {
     public static void main(String[] args) {
        int n=13;
        int k=2;
        int mask=(~0<<k);

        System.out.println((n&mask));
    }
}
