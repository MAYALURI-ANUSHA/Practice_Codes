import java.util.*;
public class Problem_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<n;i++){
            int y=k/i;
            if(k==i*y&&y<=n){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
