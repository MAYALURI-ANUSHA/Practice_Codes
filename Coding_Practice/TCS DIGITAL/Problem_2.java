import java.util.*;
public class Problem_2 {
    static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return GCD(b,a%b);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int N=x+y;
        if(z<=N){
        if((z%GCD(x,y))==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }}
    }
}
