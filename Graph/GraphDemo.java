import java.util.ArrayList;

public class GraphDemo {

    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i = 0; i < adj.size(); i++) {
            System.out.print(i + " : ");
            for(int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 7;

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        addEdge(adj, 1,2);
        addEdge(adj, 1,3);
        addEdge(adj, 3,5);
        addEdge(adj, 2,5);
        addEdge(adj, 2,4);
        addEdge(adj, 4,5);
        addEdge(adj, 4,6);
        addEdge(adj, 5,6);

        System.out.println(adj);

        printGraph(adj);

    }
    
}
