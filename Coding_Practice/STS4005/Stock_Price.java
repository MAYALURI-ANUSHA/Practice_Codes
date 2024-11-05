//05-03-2024
import java.util.*;
public class Stock_Price {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int count=1;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>=arr[j]){
                    count++;
                }
                else
                break;
            }
            System.out.print(count+" ");
        }
    }
}
