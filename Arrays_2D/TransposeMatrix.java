import java.util.Arrays;

public class TransposeMatrix {

    public static void transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 1, 2, 3 },
                { 6, 5, 1, 2 },
                { 7, 6, 5, 1 }
        };

        System.out.println("Matrix Before Transpose");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        transpose(matrix);

        System.out.println("Matrix After Transpose");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
