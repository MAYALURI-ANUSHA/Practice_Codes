public import java.util.*;
 
public class Graph_coloring{
 
    static ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
    public static void addEdge(int a, int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
 
    static boolean graphColoring(ArrayList < ArrayList < Integer >> adj, int[]color, int m, int v, int V)
    {
        if (v == V)
            return true;
        for (int c=1; c <=m; c++)
        {
            if (isValid(adj, color, c, v))
            {
                color[v] = c;
                if (graphColoring(adj, color, m, v+1, V))
                    return true;
                color[v] = 0;
            }
        }
        return false;
    }
 
    static boolean isValid(ArrayList < ArrayList < Integer >> adj,  int[]color, int c, int v)
    {
        for (int u: adj.get(v))
        {
            if (color[u] == c)
            return false;
        }
        return true;
    }
 
 
 
    public static void main(String[] args) {
        int V = 10;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList < > ());
        }
        addEdge(0, 1);
    addEdge(0, 4);
    addEdge(0, 5);
    addEdge(1, 2);
    addEdge(1, 6);
    addEdge(2, 3);
    addEdge(2, 8);
    addEdge(3, 4);
    addEdge(3, 9);
    addEdge( 4, 7);
    addEdge(5, 8);
    addEdge( 5, 9);
    addEdge(6, 7);
    addEdge(6, 9);
    addEdge(7, 8);
       
        System.out.println(adj);
        int[] color = new int [V];
 
        for(int i =0;i<V;i++ )
            color[i]=0;
 
        int m = 1;
        System.out.println( "Is coloring possible using 1 color: " + graphColoring(adj, color, m, 0, V));
        m = 2;
        System.out.println("Is coloring possible using 2 colors: " + graphColoring(adj, color, m, 0, V));
        m = 3;
        System.out.println( "Is coloring possible using 3 colors: " + graphColoring(adj, color, m, 0, V));
       
    }
 
    {
       
    }
} Graph_coloring {
    
}
