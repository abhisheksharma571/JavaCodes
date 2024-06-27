package Graphs;

import java.util.ArrayList;

public class cycleInDirectedGraph {
    // Function to detect cycle in a directed graph.
    public static boolean dfs(int x, boolean[] vis, boolean[] dfsv, ArrayList<ArrayList<Integer>> adj){
        vis[x] = true;
        dfsv[x] = true;
        //call dfs on unvisited connections
        for(int i: adj.get(x)){
            //unvisited
            if(vis[i] == false){
                if(dfs(i,vis,dfsv,adj)){
                    return true;
                }
            }
            //if visited and dfsvisited
            else if(dfsv[i]==true) return true;
        }
        dfsv[x] = false;
        return false;
    }
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfsv = new boolean[V];

        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfs(i,vis,dfsv,adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
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
        System.out.println(isCyclic(V, adj));

        addEdge(adj, 4, 5);
        addEdge(adj, 6, 4);
        addEdge(adj, 5, 7);
        addEdge(adj, 7, 6);

        System.out.println(isCyclic(V, adj));
    }
}
