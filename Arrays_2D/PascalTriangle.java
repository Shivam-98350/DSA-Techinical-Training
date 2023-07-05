import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> tri=new ArrayList<>();

        tri.add(new ArrayList<>());
        tri.get(0).add(1);

        for(int i=1;i<numRows;i++)
        {
            List<Integer> curr = new ArrayList<>();
            List<Integer> temp = tri.get(i-1);

            curr.add(1);

            for(int j=1;j<i;j++)
            {
                curr.add(temp.get(j-1)+temp.get(j));
            }

            curr.add(1);

            tri.add(curr);
            
        }
        
        return tri;
    }


    public static void main(String[] args) {

        System.out.println("The pascal Triangle is ");
        System.out.println(generate(10));
        
    }
    
}
