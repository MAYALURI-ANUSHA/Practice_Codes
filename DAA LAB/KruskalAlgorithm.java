import java.util.Arrays;
import java.util.Comparator;

class KruskalAlgorithm {

    // Class to represent an edge in the graph
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Class to represent a subset for union-find
    static class Subset {
        int parent, rank;

        Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }

    // Function to find the set of an element i (uses path compression technique)
    static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);

        return subsets[i].parent;
    }

    // Function that does union of two sets of x and y (uses union by rank)
    static void union(Subset[] subsets, int x, int y) {
        int xRoot = find(subsets, x);
        int yRoot = find(subsets, y);

        if (subsets[xRoot].rank < subsets[yRoot].rank)
            subsets[xRoot].parent = yRoot;
        else if (subsets[xRoot].rank > subsets[yRoot].rank)
            subsets[yRoot].parent = xRoot;
        else {
            subsets[yRoot].parent = xRoot;
            subsets[xRoot].rank++;
        }
    }

    // Function to perform Kruskal's algorithm on the given graph
    static void kruskal(Edge[] edges, int V) {
        // Sort the edges in non-decreasing order of their weights
        Arrays.sort(edges, Comparator.comparingInt(o -> o.weight));

        // Allocate memory for creating V subsets with rank and parent
        Subset[] subsets = new Subset[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset(i, 0);
        }

        // Initialize result
        Edge[] result = new Edge[V - 1];

        // Index used for result[]
        int e = 0;

        // Index used for sorted edges
        int i = 0;

        // Number of edges to be taken is equal to V-1
        while (e < V - 1) {
            Edge nextEdge = edges[i++];

            int x = find(subsets, nextEdge.src);
            int y = find(subsets, nextEdge.dest);

            // If including this edge does not cause a cycle, include it in the result
            if (x != y) {
                result[e++] = nextEdge;
                union(subsets, x, y);
            }
        }

        // Print the constructed MST in the specified format
        System.out.println("Minimum Spanning Tree (MST) using Kruskal's algorithm:");
        for (i = 0; i < e; ++i) {
            System.out.println(result[i].src + "    :    " + result[i].dest + "    =    " + result[i].weight);
        }
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        // Example graph
        int V = 4;
        Edge[] edges = new Edge[5];
        edges[0] = new Edge(0, 1, 10);
        edges[1] = new Edge(0, 2, 6);
        edges[2] = new Edge(0, 3, 5);
        edges[3] = new Edge(1, 3, 15);
        edges[4] = new Edge(2, 3, 4);

        kruskal(edges, V);
    }
}
