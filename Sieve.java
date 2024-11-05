import java.util.Scanner;
public class Sieve{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean[] a=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j=j+i){
                a[j]=true;
            }
        }
        for(int i=m;i<n+1;i++){
            if(a[i]==false){
                System.out.println(i);
            }
        }
        sc.close();
    }
}