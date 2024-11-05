package ACCENTURE;

import java.util.*;
public class Problem_11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        if(n>=1&&n<10){
            res=n;
        }else if(n>=10&&n<100){
            res=9;
        }else if(n>100&&n<1000){
            res=(n-100+1)+9;
        }else if(n>=1000&&n<10000){
            res=909;
        }else if(n>=10000&&n<100000){
            res=(n-10000+1)+909;
        }else if(n==100000){
        res=90909;
        }
        System.out.print(res);
    }
}