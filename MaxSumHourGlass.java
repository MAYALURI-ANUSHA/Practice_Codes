import java.util.*;
public class MaxSumHourGlass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r=sc.nextInt();
        System.out.print("Enter number of columns:");
        int c=sc.nextInt();
        System.out.print("Enter the elements of the array:");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        sc.close();
        }
}