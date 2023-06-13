public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        
        int ans=recur(amount,coins,"");

       return ans==Integer.MAX_VALUE?-1:ans;
    }

    public static int recur(int amount,int[] coins,String out)
    {
       
       if(amount==0)
       {
            System.out.println(out);
           return 0;
       }

        int min=Integer.MAX_VALUE;
       for(int i=0;i<coins.length;i++)
       {
           if(amount-coins[i]>=0)
           {    
                int ans=recur(amount-coins[i],coins,out+" "+coins[i]);

          
               if(ans!=Integer.MAX_VALUE)
               {
                   min=Math.min(min,ans+1);
               }
           }
       
       }

       return min;
    }
    public static void main(String[] args) {
        int coin[]={1,2,5};
        System.out.println("Minimum number of coins needed : "+coinChange(coin,10));
    }
}
