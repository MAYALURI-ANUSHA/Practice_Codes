//Given two integers which represent the number of rows and columns
//we need to print the possible ways of forming a matrix with different dimensions

import java.util.Scanner;
public class Possible_Matrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int p=r*c;
        for(int i=1;i<=(Math.min(r,c));i++){
            if(p%i==0){
                System.out.println(i+","+p/i);
                System.out.println(p/i+","+i);
            }
        }

    }
}
