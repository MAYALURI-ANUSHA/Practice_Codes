import java.util.*;
public class HackwithInfy_Sample2 {
    public static void Main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int h=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        if(sum>(m*h)){
            System.out.print(-1);
        }else{
            
        }
        sc.close();
    }
}