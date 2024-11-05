package TCS_TRAINING;
import java.util.*;
public class Problem_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max_sum=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=Math.max(sum,sum+arr[i]);
            max_sum=Math.max(sum,max_sum);
        }
        System.out.print(max_sum);
    }
}