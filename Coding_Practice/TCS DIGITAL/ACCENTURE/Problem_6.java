package ACCENTURE;
import java.util.*;
public class Problem_6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int total=0;
        for(int i=0;i<s.length();i++){
            total=total+s.charAt(i);
        }
        System.out.print(total/s.length());
    }
}
