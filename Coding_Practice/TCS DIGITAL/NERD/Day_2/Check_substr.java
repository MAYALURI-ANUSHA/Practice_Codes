package NERD.Day_2;
import java.util.*;
public class Check_substr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String sub=sc.nextLine();
        boolean found=false;
        int inputLength=input.length();
        int subLength=sub.length();
        int len=inputLength-subLength;
        for(int i=0;i<=len;i++){
            for(int j=0;j<subLength;j++){
                if(input.charAt(i+j)!=sub.charAt(j)){
                    break;
                }
                if(j==subLength){
                    found=true;
                }
            }
            
        }
        if(found){
            System.out.print("found");
        }
        else{
            System.out.println("Not found");
        }

    }
}
