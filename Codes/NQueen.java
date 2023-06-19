import java.util.Arrays;

public class NQueen {

    static void printBoard(char board[][], int currentRow) {
        if (currentRow == board.length) {
            System.out.println("One of The Solution is ");
            for (int i = 0; i < board.length; i++)
                System.out.println(board[i]);

            return;
        }

        for (int col = 0; col < board[currentRow].length; col++) {
            if (isSafe(board, currentRow, col)) {
                board[currentRow][col] = 'q';
                printBoard(board, currentRow + 1);
                board[currentRow][col] = '.';
            }
        }
        return;
    }

    static boolean isSafe(char board[][], int row, int col) {

        for (int i = 0; i <= row; i++) {
            if (board[i][col] == 'q')
                return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'q')
                return false;
        }

        for (int i = row, j = col; j < board.length && i >= 0; i--, j++) {
            if (board[i][j] == 'q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        char board[][] = new char[4][4];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
        printBoard(board, 0);

    }

}
