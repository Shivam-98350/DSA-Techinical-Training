import java.util.Arrays;

public class SodukoSolver {

    public static void main(String[] args) {

        char board[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

                solve(board,0,0);
    }

    public static boolean solve(char board[][],int row,int col)
    {

        if(col==board.length)
        {
            col=0;
            row=row+1;
        }
        if(row==board.length)
        {
            System.out.println(board);
            return true;
        }

        if(board[row][col]!='.')
        {
            solve(board, row, col+1);
        }

        
        for(char i='1';i<=board.length+'0';i++)
        {
            if(isSafe(board,row,col,i))
            {
                System.out.println(Arrays.deepToString(board));
                board[row][col]=i;
                boolean res =solve(board, row, col+1);
                if(res)return true;
                board[row][col]='.';
                
            }
        }

        return false;
        
    }

    public static boolean isSafe(char[][]board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c) return false;//col check

            if(board[row][i]==c) return false; //row check

            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c) return false;//checking in each 3 x 3 matrix
        }
        return true;

    }

}
