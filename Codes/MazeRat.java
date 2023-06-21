import java.util.ArrayList;

public class MazeRat {

    static int[][] board = { { 0, 1, 1, 1 },
            { 1, 1, 1, 0 },
            { 1, 0, 1, 1 },
            { 0, 0, 1, 1 } };

    // {{1,1},{1,1}};

    // {
    // { 1, 0, 0, 0 },
    // { 1, 1, 0, 1 },
    // { 0, 1, 0, 0 },
    // { 1, 1, 1, 1 }
    // };

    public static void getMaze(int row, int col, String s, ArrayList<String> result) {

        if (row == board.length - 1 && col == board[0].length - 1) {
            result.add(s);
            return;
        }

        int ro[] = { 0, 0, 1, -1 };
        int co[] = { 1, -1, 0, 0 };

        for (int i = 0; i < 4; i++) {

            int nrow = row + ro[i];
            int ncol = col + co[i];

            String tch = "";

            if (i == 0) {
                tch = "R";

            } else if (i == 1) {

                tch = "L";
            } else if (i == 2) {

                tch = "D";
            } else {
                tch = "U";

            }

            if (nrow >= 0 && ncol >= 0 && nrow < board.length && ncol < board[0].length && board[nrow][ncol] == 1) {
                board[nrow][ncol] = 0;
                getMaze(nrow, ncol, s + tch, result);
                board[nrow][ncol] = 1;

            }
        }

        return;
    }

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();

        if (board[0][0] != 0) {

            board[0][0] = 0;
            getMaze(0, 0, "", result);
        }
        System.out.println(result);
    }

}
