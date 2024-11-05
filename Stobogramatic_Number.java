import java.util.*;
public class Stobogramatic_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                a="0"+a;
            }
            else if(s.charAt(i)=='1'){
                a="1"+a;
            }
            else if(s.charAt(i)=='8'){
                a="8"+a;
            }
            else if(s.charAt(i)=='6'){
                a="9"+a;
            }
            else if(s.charAt(i)=='9'){
                a="6"+a;
            }
        }
        if(a.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}