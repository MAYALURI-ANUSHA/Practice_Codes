package NERD.Day_2;

import java.util.*;
public class Substr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        if(start<0||end>input.length()||start>end){
            System.out.print("Invalid index values");

        }
        else{
            int l=end-start; //5-1=4
            char sub[]=new char[l];
            for(int i=0;i<l;i++){
                sub[i]=input.charAt(start+i);
            }
            String result=new String(sub);
            System.out.println(result);
        }
    }
}
