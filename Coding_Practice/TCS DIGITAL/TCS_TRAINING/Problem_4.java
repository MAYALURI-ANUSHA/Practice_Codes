package TCS_TRAINING;
import java.util.*;
public class Problem_4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n-2;i++){
            if(arr[i]==arr[i+2]){
                flag=1;
                System.out.println("Yes");
                break;
            }
        }
        if(flag==0){
            System.out.println("No");
        }
    }
}
