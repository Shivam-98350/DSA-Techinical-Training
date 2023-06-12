
public class Pattern_2 {

     static void star(int n)
    {
        if(n==0)return;
        System.out.print("*");
        star(n-1);
    }

    static void pattern(int row,int col)
    {
        if(row==0)return;

        star(col);
        System.out.println();
        pattern(row-1, col- 1);
    }

    public static void main(String[] args) {
        System.out.println("Printing Pattern Using Recursion");
        pattern(5, 5);

    }
    
    
}
