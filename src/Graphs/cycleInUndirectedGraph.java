package Graphs;

import java.util.ArrayList;

public class cycleInUndirectedGraph {
    // Function to detect cycle in an undirected graph.
    public static boolean dfs(int s, int p, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[s] = true;
        //call dfs on connections of s
        for(int i: adj.get(s)){
            if(vis[i] == false){
                if(dfs(i,s,vis,adj) == true){
                    return true;
                }
            }
            else if(vis[i] == true && i!=p){  //if vertex is visited and not parent
                return true;  // cycle detected
            }
        }
        return false;
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfs(i,-1,vis,adj)==true) return true;
            }
        }
        return false;
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 8;
        //create adjacency list
        ArrayList<ArrayList<Integer>>  adj = new ArrayList<>(V);

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        //add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        System.out.println(isCycle(V, adj));

        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 7);
        addEdge(adj, 6, 7);

        System.out.println(isCycle(V, adj));
    }
}
