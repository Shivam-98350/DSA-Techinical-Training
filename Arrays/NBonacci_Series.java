import java.util.LinkedList;
import java.util.Queue;

public class NBonacci_Series {

    static void bonacciseries(int n, long m) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < (n - 1); i++) {
            q.add(0);
        }
        q.add(1);


        long su = 1;

        for (int i = 0; i < m; i++) {

            q.add((int) su);

            long temp = q.peek();
            q.remove();
            su = (2 * su) - temp;

            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {

        int N = 3, M = 15;
        bonacciseries(N, M);

    }

}
