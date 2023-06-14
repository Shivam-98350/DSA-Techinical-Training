import java.util.ArrayList;

public class SubSequenceRecur {

    public static ArrayList<String> recur(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> ans =new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> temp =recur(s.substring(1));
        ArrayList<String> result =new ArrayList<>();

        for(String str:temp)
        {
            result.add(str);
            result.add(s.charAt(0)+str);
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println("The SubSequence is : ");
        System.out.println(recur("Shivam"));
    }
    
}
