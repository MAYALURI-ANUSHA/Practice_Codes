package TCS_TRAINING;
import java.util.*;
public class Problem_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int maxlength=0;
        int length=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                length+=1;
            }
            else{
                maxlength=Math.max(maxlength,length);
                length=0;
            }
        }
        System.out.println(maxlength+1);
    }
}