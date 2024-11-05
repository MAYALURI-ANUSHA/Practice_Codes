package ACCENTURE;

import java.util.*;
public class Problem_3 {
    public static boolean goodint(int n){
        int x=1;
        int y=(int)Math.cbrt((double)(n));
        while(x<=y){
            if(n==((x*x*x))+(Math.pow(y,3))){
                return true;
            }else if((x*x*x)+(Math.pow(y,3))<n)x++;
            else y--;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        count=0;
        
            for(int j=0;j<n;j++){
                if(goodint(arr[j])){
                    count++;
                }
            }
        System.out.print(count);
    }
}
