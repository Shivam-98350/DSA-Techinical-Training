import java.util.ArrayList;

public class MazePath {
    
    public static ArrayList<String> getMaze(int row,int col)
    {
        if(row==0 && col==0)
        {
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }

        ArrayList<String> hor=new ArrayList<>();
        ArrayList<String> ver=new ArrayList<>();
        ArrayList<String> result=new ArrayList<>();
        if(row-1>=0)ver=getMaze(row-1, col);
        if(col-1>=0)hor=getMaze(row, col-1);


        for(String s:ver)
        {
            result.add("h"+s);
        }
        for(String s:hor)
        {
            result.add("v"+s);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("The Path in the maze are : "+getMaze(2, 2));
        
    }
}
