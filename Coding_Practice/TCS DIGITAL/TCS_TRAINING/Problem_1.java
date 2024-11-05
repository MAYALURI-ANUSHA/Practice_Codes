package TCS_TRAINING;
import java.util.*;
public class Problem_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if((arr[i]+arr[i+1])<0){
                arr[i]=-1*arr[i];
                arr[i+1]=-1*arr[i+1];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}


// If number of negative numbers is even, print the total sum
// If number of negative numbers is odd, print the total sum-min element