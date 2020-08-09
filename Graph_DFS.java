
/**
 * Graph_DFS
 */

import java.util.*;
import java.util.LinkedList;

public class Graph_DFS {

    private int V; // Number of vertices in the graph

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Graph_DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // Recursivee helper function for DFS
    private void helper_dfs(int v, boolean visited[]) {
        // Mark the current node as visited and print them
        visited[v] = true;
        System.out.print(v + " ");

        // Recursive for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                helper_dfs(n, visited);
        }
    }

    // The function to do DFS traversal.
    public void DFS(int v) {
        // Mark all the vertices as not visited
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Calling recursive helper function
        helper_dfs(v, visited);
    }

    public static void main(String[] args) {
        int vertices = 10;
        int n = 1;

        Graph_DFS obj = new Graph_DFS(vertices);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);

        obj.DFS(n);

    }
}