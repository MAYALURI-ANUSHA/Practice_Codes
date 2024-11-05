import java.util.*;

class PrimAlgorithm {
    static class Edge implements Comparable<Edge> {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static List<Edge> primMST(List<List<Edge>> graph) {
        int vertices = graph.size();
        boolean[] visited = new boolean[vertices];
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        List<Edge> minimumSpanningTree = new ArrayList<>();

        // Start with the first vertex
        priorityQueue.add(new Edge(0, 0));

        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();
            int currentVertex = currentEdge.destination;

            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
                minimumSpanningTree.add(currentEdge);

                // Add neighbors to the priority queue
                List<Edge> neighbors = graph.get(currentVertex);
                for (Edge neighbor : neighbors) {
                    if (!visited[neighbor.destination]) {
                        priorityQueue.add(neighbor);
                    }
                }
            }
        }

        return minimumSpanningTree;
    }

    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();

        // Example graph representation
        graph.add(Arrays.asList(new Edge(1, 2), new Edge(2, 4)));
        graph.add(Arrays.asList(new Edge(0, 2), new Edge(2, 1), new Edge(3, 3)));
        graph.add(Arrays.asList(new Edge(0, 4), new Edge(1, 1), new Edge(3, 5)));
        graph.add(Arrays.asList(new Edge(1, 3), new Edge(2, 5)));

        List<Edge> result = primMST(graph);

        // Print the minimum spanning tree in the specified format
        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : result) {
            System.out.println(edge.destination + "    :    " + (edge.destination + 1) + "    =    " + edge.weight);
        }
    }
}