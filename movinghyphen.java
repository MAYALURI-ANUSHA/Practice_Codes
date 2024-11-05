import java.util.*;
public class movinghyphen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s1=" "+s1;}
            else if(s.charAt(i)!=' '){
                s1=s1+s.charAt(i);}}
        System.out.println(s1);
    sc.close();}}