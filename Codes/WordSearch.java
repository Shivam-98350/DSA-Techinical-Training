
public class WordSearch {

    public static boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {

                    if (recur(0, i, j, board, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean recur(int ind, int i, int j, char[][] board, String word) {
        if (ind == word.length())
            return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(ind) != board[i][j])
            return false;

        boolean ans = false;

        board[i][j] = '*';

        int row[] = { 0, 0, 1, -1 };
        int col[] = { 1, -1, 0, 0 };

        for (int k = 0; k < 4; k++) {

            int nrow = i + row[k];
            int ncol = j + col[k];

            ans = recur(ind + 1, nrow, ncol, board, word);
            if (ans)
                break;

        }

        board[i][j] = word.charAt(ind);

        return ans;
    }

    public static void main(String[] args) {

        char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

        System.out.println(exist(board, "ABCCED"));

    }

}
