package ACCENTURE;
import java.util.*;
public class Problem_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int f=s.charAt(0)-'0';
        int i=1;
        while(i<=s.length()-2){
            char op=s.charAt(i);
            int l=s.charAt(i+1)-'0';
            if(op=='A'){
                f=f&l;
            }else if(op=='B'){
                f=f|l;
            }else{
                f=f^l;
            }
            i+=2;
        }
        System.out.println(f);
    }
}
