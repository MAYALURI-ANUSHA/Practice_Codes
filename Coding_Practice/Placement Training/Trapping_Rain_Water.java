//Trapping Rain Trapping_Rain_Water

import java.util.Scanner;
public class Trapping_Rain_Water{
    public static void main(String [] args){

        // Reading the input

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        //Finding Left array and Right array to store max elements

        int L[]=new int[n];
        int R[]=new int[n];
        int L_max=0;
        int R_max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>L_max){
                L[i]=arr[i];
            }
            else{
                L[i]=L_max;
            }
            L_max=L[i];
            if(arr[n-i-1]>R_max){
                R[n-i-1]=arr[n-i-1];
            }
            else{
                R[n-i-1]=R_max;
            }
            R_max=R[n-i-1];
            }


        //Finding the sum
        int sum=0;
        for(int i=0;i<n;i++){
            int min;
            if(L[i]<R[i]){
                min=L[i];
            }
            else{
                min=R[i];
            }
            sum=sum+min-arr[i];
        }
        System.out.println(sum);
        }
    }