import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int scol = 0;
        int srow = 0;
        int ecol = matrix[0].length;
        int erow = matrix.length;
        int total = m * n;

        while (total > 0) {
            for (int i = scol; i < ecol && total>0; i++) {
                ans.add(matrix[srow][i]);
                total--;
            }
            srow++;

            for (int i = srow; i < erow && total>0; i++) {
                ans.add(matrix[i][ecol - 1]);
                total--;
            }
            ecol--;

            for (int i = ecol - 1; i >= scol && total>0; i--) {
                ans.add(matrix[erow - 1][i]);
                total--;
            }
            erow--;

            for (int i = erow - 1; i >= srow && total>0; i--) {
                ans.add(matrix[i][scol]);
                total--;
            }
            scol++;

        }

        return ans;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        System.out.println(spiralOrder(matrix));

    }

}
