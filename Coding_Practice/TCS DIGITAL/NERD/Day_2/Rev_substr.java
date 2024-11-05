package NERD.Day_2;
import java.util.*;
public class Rev_substr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder result=new StringBuilder();
        int start=sc.nextInt();
        int end=sc.nextInt();
        if(start<0||end>input.length()||start>end){
            System.out.print("Invalid index");
        }
        else{
            
            result.append(input.substring(0,start));
            for(int i=end-1;i>=start;i--){
                result.append(input.charAt(i));
            }
            result.append(input.substring(end));
            
        System.out.print(result.toString());
        }
    }
}
