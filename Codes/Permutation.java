import java.util.ArrayList;

public class Permutation {

    public static ArrayList<String> perm(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> arr=new ArrayList<>();
            arr.add("");
            return arr;
        }

        ArrayList<String> temp=perm(s.substring(1));
        ArrayList<String> result=new ArrayList<>();

        for(String str:temp)
        {
            for(int i=0;i<=str.length();i++)
            {
                StringBuilder sb=new StringBuilder(str);
                sb.insert(i,s.charAt(0));
                result.add(sb.toString());
            }
        }
        
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Permutation of the String is : "+perm("abc"));
        
    }
    
}
