package Graphs;
import java.util.*;

public class dijkstraAlgo {
    // Function to find the shortest distance of all the vertices from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        boolean[] vis = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE); // Fill ans with maximum value
        ans[S] = 0; // Distance from source to source is 0
        pq.add(new int[]{S, 0});

        while (!pq.isEmpty()) {
            int[] x = pq.remove();
            int vertex = x[0];
            if (vis[vertex] == true) continue;
            vis[vertex] = true;
            for (ArrayList<Integer> i : adj.get(vertex)) {
                int v = i.get(0); // Neighbor
                int w = i.get(1); // Weight
                if (ans[vertex] + w < ans[v]) {
                    ans[v] = ans[vertex] + w;
                    pq.add(new int[]{v, ans[v]});
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Test the dijkstra function
        int V = 5; // Number of vertices
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (Example graph)
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 10)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(4, 3)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(2, 2)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(4, 4)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(3, 9)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(2, 7)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(1, 1)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(2, 8)));

        int S = 0; // Source vertex

        int[] result = dijkstra(V, adj, S);

        // Print the result
        System.out.println("The shortest distances from source vertex " + S + " are:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Vertex " + i + ": " + result[i]);
        }
    }
}

