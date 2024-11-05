package ACCENTURE;

import java.util.*;
public class Problem_10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(((2*(n*(n+1)/2))+(n*(n-1)/2))%1000007);
        System.out.print((n*((3*n)+1)/2)%1000007);
    }
}
