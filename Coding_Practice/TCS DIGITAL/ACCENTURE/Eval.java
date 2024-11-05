package ACCENTURE;
import java.util.*;
public class Eval {
    public static int countDig(int n){
        int r=0;
        while(n>0){
            n=n/10;
            r++;
        }
        return r;
    }
    public static int precedence(char c){
        switch(c){

        case '+':
        return 1;
        case '-':
        return 1;
        case '*':
        return 2;
        case '/':
        return 2;}
        return 0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        System.out.print(precedence('*'));
    }
}
