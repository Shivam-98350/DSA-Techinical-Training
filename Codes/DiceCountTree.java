public class DiceCountTree {

    static void dice(int curr,int end,String res)
    {
        if(curr==end)
        {
            System.out.println(res);
            return;
        }
        if(curr>end)return;

        for(int i=1;i<=6;i++)
        {
            dice(curr+i, end, res+i);
        }

    }
    public static void main(String[] args) {

        dice(0,10,"");
        
    }
}
