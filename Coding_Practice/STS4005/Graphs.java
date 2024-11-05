import java.util.*;
public class Graphs {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        List<List<Integer>> l=new ArrayList<>(V);
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<E;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            l.get(m).add(n);
            l.get(n).add(m);
        }
        System.out.println(l);



    }
   
}
