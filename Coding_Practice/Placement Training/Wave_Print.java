import java.util.Scanner;
public class Wave_Print {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }
                else{
                    System.out.print(arr[m-j-1][i]+" ");
                }
            }
        }
    }
}
