package ACCENTURE;

import java.util.*;
public class Problem_8 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fm=0;
        int sm=0;
        int fi=0;
        int si=0;
        for(int i=0;i<n;i++){
            if(arr[i]>sm){
                sm=arr[i];
                si=i;
            }
            if(sm>fm){
                int temp=fm;
                fm=sm;
                sm=temp;
                int tempi=fi;
                fi=si;
                si=tempi;
            }
        }
        System.out.println(fm+" "+fi);
        System.out.println(sm+" "+si);
    }
}
