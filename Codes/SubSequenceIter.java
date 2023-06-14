import java.util.ArrayList;

public class SubSequenceIter {

    public static ArrayList<String> iter(String str)
    {
        ArrayList<String> ans=new ArrayList<>();
        ans.add("");

        for(int i=0;i<str.length();i++)
        {
            int n=ans.size();
            for(int j=0;j<n;j++)
            {
                String temp=ans.get(j)+str.charAt(i);
                if(!ans.contains(temp))
                {
                    ans.add(temp);
                }
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println("The Subsequence is : ");
        System.out.println(iter("Shivam"));
    }
    
}
