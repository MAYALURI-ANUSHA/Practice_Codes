import java.util.*;
public class MaxSum {
    public static void MaxSum(int arr[]){
        int n=arr.length;
        int sum=java.util.stream.IntStream.of(arr).sum();
        int presum=0;
        for(int i=0;i<n;i++){
            presum=presum+arr[i];
            if (presum==sum){
            System.out.println(sum); 
            }
            sum=sum-arr[i];
        }
    }
    public static void main(String[] args) {
       // int arr[]=new int[]{-2,5,3,1,2,6,-4,2};
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        MaxSum(arr);   
    }
}