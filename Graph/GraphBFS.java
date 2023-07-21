import java.util.*;

public class GraphBFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj) {
        boolean visit[] = new boolean[adj.size()];

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < visit.length; i++) {

            if (visit[i] == false) {

                q.add(i);
                visit[i] = true;

                while (!q.isEmpty()) {
                    int temp = q.remove();

                    System.out.print("-"+temp+"-");
                    for (int x : adj.get(temp)) {
                        if (!visit[x]) {
                            visit[x] = true;
                            q.add(x);
                        }
                    }
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 8;

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 5);
        addEdge(adj, 2, 5);
        addEdge(adj, 2, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        addEdge(adj, 0, 7);

        bfs(adj);

        System.out.println(adj);

    }

}
