public class MazePathDiagonal {

     public static void maze(int currow,int curcol,String res)
    {
        if(currow==0 && curcol==0)
        {
            System.out.print(res);
            System.out.print("  ");
            return;
        }

        if(currow>=0)maze(currow-1, curcol, res+'v');
        if(curcol>=0)maze(currow, curcol-1,res+'h');
        if(curcol>=0 && currow>=0)maze(currow-1, curcol-1,res+'d');
    }

    public static void main(String[] args) {
        maze(2,2,"");
    }
    
}
