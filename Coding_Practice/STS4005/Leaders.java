import java.util.Scanner;
public class Leaders{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        int max_from_right=0;
        for(int i=n-1;i>0;i--){
            if(max_from_right<arr[i]){
                max_from_right=arr[i];
                System.out.print(max_from_right+" ");
            }
        }
    }
}