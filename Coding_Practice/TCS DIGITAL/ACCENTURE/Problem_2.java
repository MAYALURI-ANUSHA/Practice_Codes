package ACCENTURE;

import java.util.*;
public class Problem_2 {

    public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static String reverse(String s){
        String r="";
        int n=s.length();
        for(int i=0;i<n;i++){
            r=r+s.charAt(n-i-1);
        }
        s=r;
        return s;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        for(i=0;i<s.length();i++){
            if(check(s.substring(i))==true){
                break;
            }
        }
        String result=s.substring(0,i);
        result=reverse(result);
        System.out.println(result);
        
    }
}
