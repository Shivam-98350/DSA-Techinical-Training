public class PermutationTree {

    static void perm(String s,String re)
    {
        if(s.length()==0)
        {
            System.out.println(re);

            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String rem=s.substring(0, i)+s.substring(i+1);
            perm(rem,re+c);

        }

    }

    public static void main(String[] args) {
        
        perm("abc","");
    }
    
}
