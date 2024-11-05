package ACCENTURE;

import java.util.*;
public class Problem_9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.print(Math.max((Math.max(l1*l2,r1*r2)),Math.max(l1*r2,r1*l2)));
    }
}
