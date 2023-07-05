import java.util.ArrayList;

class upperLowerTriangleSum {

    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int lsum = 0;
        int hsum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    hsum += matrix[i][j];
                }
                if (j >= i) {
                    lsum += matrix[i][j];
                }
            }
        }

        ans.add(lsum);
        ans.add(hsum);

        return ans;

    }

    public static void main(String[] args) {

        int n = 3;
        int mat[][] = { { 6, 5, 4 },
                { 1, 2, 5 },
                { 7, 9, 7 } };

        System.out.println("Sum of Lower and Upper Diagonal is : " + sumTriangles(mat, n));

    }
}