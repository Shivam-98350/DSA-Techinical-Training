import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

   static String keys[]={" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> letterCombinations(String digits) {

        if(digits.length()==0)
        {
            List<String> ans=new ArrayList<>();
            return ans;
        }
        if(digits.length()==1)
        {
            List<String> ans=new ArrayList<>();
            String s=keys[digits.charAt(0)-'0'];
            for(int i=0;i<s.length();i++)
            {
                ans.add(""+s.charAt(i));
            }
            return ans;
        }

        String curr=keys[digits.charAt(0)-'0'];
        String rem=digits.substring(1);

        List<String> ans=new ArrayList<>();

        for(int i=0;i<curr.length();i++)
        {
            List<String> temp=letterCombinations(rem);

            for(String s:temp)
            {
                ans.add(curr.charAt(i)+s);
            }

        }
        return ans;
    } 

    public static void main(String[] args) {
        System.out.println("The Combination of letters are : "+letterCombinations("234"));
    }
}
