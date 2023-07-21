import java.util.*;

public class GraphDfs {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean visit[], int source) {

        visit[source] = true;
        System.out.println(source);

        for (int x : adj.get(source)) {
            if (!visit[x])
                dfs(adj, visit, x);
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

        boolean visit[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visit[i])
                dfs(adj, visit, i);
        }

        System.out.println("\n" + adj);

    }

}
