package NERD.Day_2;

//import java.util.*;
public class Longest_Palindrome {

    public static String longestPalin(String s){
        if(s.length()<=1){
            return s;
        }
        int max=1;
        int n=s.length();
        int start=0,end=0;
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }}
                int len=r-l+1;
                if(len>max){
                    max=len;
                    start=l+1;
                    end=r-1;
                }
            }
        
        return s.substring(start,end+1);
    }
    public static void main(String[]args){
       // Scanner sc=new Scanner(System.in);
        String s="aksmadambl";
        String result=longestPalin(s);
        System.out.println(result);

    }}
