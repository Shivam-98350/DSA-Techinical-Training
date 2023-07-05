import java.util.HashMap;
import java.util.Map;

public class RomantoInt {

     public static int romanToInt(String s) {
        
        
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int re=map.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--)
        {
             if(re>map.get(s.charAt(i)) && map.get(s.charAt(i))!=map.get(s.charAt(i+1)))
             {
                 re =re-map.get(s.charAt(i));
             }
            else
            {
                re = re + map.get(s.charAt(i));
            }
           
        }
       
        return re;
    }

    public static void main(String[] args) {

        String Roman="MCMXCIV";

        System.out.println("Roman to Integer : "+Roman+" = "+romanToInt(Roman));
        
    }
    
}
