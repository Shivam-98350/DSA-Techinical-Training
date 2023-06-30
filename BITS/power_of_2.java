public class power_of_2 {

    public static void main(String[] args) {
        
        int n=1024;
        System.out.println(ispower(n));
    }

    private static boolean ispower(int n) {
        
        if((n&(n-1))==0)return true;

        return false;
    }
    
}
