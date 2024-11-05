import java.io.*;
import java.util.*;

public class Kruskal_MST {

    public static void main(String[] args) {

        // Kruskal's Algorithm

        // Create a Scanner object to read input from the standard input stream
        Scanner sc = new Scanner(System.in);

        // Read the number of vertices and edges from input
        int v = sc.nextInt();
        int ed = sc.nextInt();

        // Create an ArrayList to store the edges
        ArrayList<Edge> edges = new ArrayList<>();
        
        // Read edge data and populate the edges ArrayList
        for (int i = 0; i < ed; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int wt = sc.nextInt();
            edges.add(new Edge(a, b, wt));
        }

        // Sort the edges based on their weights using the Collections.sort method
        Collections.sort(edges, Comparator.comparingInt(e -> e.wt));

        // Create an array to represent the parent of each vertex
        int[] parent = new int[v];
        
        // Initialize each vertex's parent to itself
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }

        // Create an ArrayList to store the edges of the Minimum Spanning Tree (MST)
        ArrayList<Edge> mstEdges = new ArrayList<>();

        // Iterate through the sorted edges
        for (Edge e : edges) {
            // Find the parent of the source and destination vertices of the edge
            int srcParent = find(parent, e.src);
            int destParent = find(parent, e.dest);

            // If the vertices are not already connected in the MST, add the edge to MST
            if (srcParent != destParent) {
                mstEdges.add(e);
                // Connect the vertices in the parent array using the union operation
                union(parent, srcParent, destParent);
            }
        }

        // Print the edges of the Minimum Spanning Tree
        for (Edge e : mstEdges) {
            System.out.println(Math.min(e.src, e.dest) + " " + Math.max(e.src, e.dest) + " " + e.wt);
        }
    }

    // Define a class to represent an edge
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    // Function to find the parent of a vertex using path compression
    static int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        // Apply path compression by recursively finding and updating the parent
        return find(parent, parent[i]);
    }

    // Function to perform union operation by setting the parent of one vertex to another
    static void union(int[] parent, int x, int y) {
        int xParent = find(parent, x);
        int yParent = find(parent, y);
        parent[xParent] = yParent;
    }
}