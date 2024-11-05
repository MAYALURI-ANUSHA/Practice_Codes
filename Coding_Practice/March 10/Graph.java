import java.util.*;

class Graph{
    ArrayList<Integer> l[]=new ArrayList[n];
    Graph();
    for(int i=0;i<n;i++){
        l[i]=new ArrayList<Integer>();
        
    }   
    void add(int v,int e){
        l[v].add(e);
    }
}
void BFS(ArrayList<Integer> l[],int v){
    boolean[] visited=new boolean[n];
    Queue<ArrayList<Integer>> q=new LinkedList<>();
    visited[v]=true;
    q.add(l[v]);
    System.out.print(v);
    while(!q.isEmpty()){
        ArrayList<Integer> t=q.poll();
        for(Integer var:t){
            if(!visited[var]){
                System.out.print(var+" ");
                q.add(l[var]);
            }
        }
    }
    
    
}
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            
        }
    }
}