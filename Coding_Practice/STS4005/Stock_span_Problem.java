//05-03-2024
import java.util.*;
public class Stock_span_Problem {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int days[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("1 ");
        for(int j=1;j<n;j++){
            if(arr[j]<arr[j-1]){
                System.out.print("1 ");
            }
            else{
                int day=0;
                int p=arr[j];
                int k=j;
                while(p>=arr[k]&&k>=0){
                    day=day+1;
                    k--;
                }
                days[j]=day;
            }
        }
        for(int l=0;l<n;l++){
            System.out.print(arr[l]);
        }
    }
}
