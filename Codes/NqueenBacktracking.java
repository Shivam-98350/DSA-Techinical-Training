import java.util.Arrays;

public class NqueenBacktracking {


    static int countways(boolean board[][] , int currentRow)
    {
        if(currentRow==board.length)
        {
            System.out.println(Arrays.deepToString(board));
            return 1;
        }

        int count=0;
        for(int col=0;col<board[currentRow].length;col++)
        {
            if(isSafe(board, currentRow, col))
            {
                board[currentRow][col]=true;
                count+=countways(board, currentRow+1);
                board[currentRow][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean board[][],int row,int col)
    {
        
        for(int i=0;i<=row;i++)
        {
            if(board[i][col])return false;
        }

        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j])return false;
        }

        for(int i=row,j=col;j<board.length && i>=0;i--,j++)
        {
            if(board[i][j])return false;
        }

        
        return true;
    }

    public static void main(String[] args) {

        boolean board[][]=new boolean[5][5];
        int ans=countways(board, 0);
        System.out.println("Number of ways to Place a Queen is : "+ans);

    }
    
}
