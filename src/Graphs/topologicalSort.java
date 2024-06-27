package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }

    public static void dfs(int s, boolean[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        vis[s] = true;
        //call connections of s
        for(int i:adj.get(s)){
            if(vis[i] == false) dfs(i, vis, adj, st);
        }
        st.push(s);
    }
    //Function to return list containing vertices in Topological order.
    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[V];

        for(int i=0;i<V;i++){
            if(vis[i] == false) dfs(i, vis, adj, st);
        }
        //copy from stack to ans
        int i = 0;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i++;
        }
        return ans;
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
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);

        int[] ans = topoSort(V, adj);
        for(int i:ans){
            System.out.print(i + " ");
        }

    }
}
