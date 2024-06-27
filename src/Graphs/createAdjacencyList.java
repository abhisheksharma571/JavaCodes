package Graphs;

import java.util.ArrayList;

public class createAdjacencyList {
    public static void addEdge(ArrayList<ArrayList<Integer>> Al, int u, int v){
        Al.get(u).add(v);
        Al.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 4;
        //create adjacency list
        ArrayList<ArrayList<Integer>>  Al = new ArrayList<>(V);

        for(int i = 0; i < V; i++){
            Al.add(new ArrayList<>());
        }
        //add edges
        addEdge(Al, 0, 1);
        addEdge(Al, 0, 2);
        addEdge(Al, 1, 3);
        addEdge(Al, 2, 3);
        System.out.println(Al);
    }
}
