import java.util.LinkedList;

/**
 * Graph_DFS
 */
import java.io.*;
import java.util.*;

public class Graph_DFS {
    private int V; // number of vertices
    private LinkedList<Integer> adj[];

    // constructor
    Graph_DFS(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }

    }

    // method to add edges
    public void add_edge_to_vertex(int v, int e) {
        adj[v].add(e);
    }

    // implementation of DFS
    public void depthFirstSearch(int v) {
        boolean visited[] = new boolean[V];
        DFS_Helper(v, visited);

    }

    // helper function for DFS
    private void DFS_Helper(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFS_Helper(n, visited);
            }
        }

    }

    public static void main(String[] args) {
        int n = 10; // no. of vertices in graph
        Graph_DFS obj = new Graph_DFS(n);
        obj.add_edge_to_vertex(0, 1);
        obj.add_edge_to_vertex(0, 2);
        obj.add_edge_to_vertex(1, 3);
        obj.add_edge_to_vertex(1, 4);
        obj.add_edge_to_vertex(2, 5);
        obj.add_edge_to_vertex(2, 7);

        obj.depthFirstSearch(0);

    }
}