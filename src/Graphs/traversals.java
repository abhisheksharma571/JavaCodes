package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class traversals {
    static ArrayList<Integer> ans = new ArrayList<>();
    // Function to return Breadth First Traversal of given graph.
    public static void bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        while(!q.isEmpty()){
            int x = q.remove();
            if(vis[x] == false){
                vis[x] = true;
                ans.add(x);
                //add connections to queue
                for(int i : adj.get(x)){
                    q.add(i);
                }
            }
        }
        System.out.println(ans);
    }
    // Function to return a list containing the DFS traversal of the graph.
    public static void dfs(int s, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        //mark vertex as visited
        vis[s] = true;
        //add vertex to ans list
        ans.add(s);
        //dfs on connections of s
        for(int i:adj.get(s)){
            if(vis[i] == false) dfs(i, vis, adj);
        }
    }
    public static void dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        dfs(0,vis,adj);
        System.out.println(ans);
    }

    //add edge
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 4;
        //create adjacency list
        ArrayList<ArrayList<Integer>>  adj = new ArrayList<>(V);

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        //add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        dfsOfGraph(V, adj);
        bfsOfGraph(V, adj);
    }
}
