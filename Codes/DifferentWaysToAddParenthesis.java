// Question 241. Different Ways to Add Parentheses
// :Given a string expression of numbers and operators, 
// return all possible results from computing all the different
//  possible ways to group numbers and operators. You may return the answer in any order. 

import java.util.*;

public class DifferentWaysToAddParenthesis {
    

    public static void main(String[] args) {

        Solution solution = new Solution();
        List<Integer> result = solution.diffWaysToCompute("2*3-4*5");
        System.out.println(result);

    }
}

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
       List<Integer> result=new ArrayList<>();

       for(int i=0;i<expression.length();i++)
       {
           char ch=expression.charAt(i);

           if(ch=='-' || ch=='*' || ch=='+')
           {
               List<Integer> left=diffWaysToCompute(expression.substring(0,i));
               List<Integer> right=diffWaysToCompute(expression.substring(i+1));

               for(int l:left)
               {
                   for(int r:right)
                   {
                       if(ch=='-')
                       {
                           result.add(l-r);
                       }
                       else if(ch=='+')
                       {
                           result.add(l+r);
                       }
                       else
                       {
                           result.add(l*r);
                       }
                   }
               }

           }
       }

        if(result.size()==0)
        {
            result.add(Integer.parseInt(expression));
        }

            return result;

    }
}
