//Minimum Stack
//Constant time complexity
//Design a stack that supports push,pop,top and retrieving the minimum element in constant time
//Implement the Minstack class
//MinStack() initialization
import java.util.*;
public class March_9 {
    static void push(int a,Stack<Integer> st1,Stack<Integer> st2){
        if(st1.isEmpty()){
            st2.push(a);
        }
        else if(st1.peek()<st2.peek()){
            st2.push(a);
        }
        st1.push(a);
    }
    static void pop(Stack<Integer> st1,Stack<Integer> st2){
        if(st1.peek()==st2.peek()){
            st2.pop();
        }
        st1.pop();
    }
    static int topElement(Stack<Integer> st1){
        return st1.peek();
    }
    static int minElement(Stack<Integer> st2){
        return st2.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int n=sc.nextInt();
        while(n>=0){
            int k=sc.nextInt();
            switch(k){
                case 1:
                    push(sc.nextInt(),st1,st2);
                case 2:
                pop(st1,st2);
                case 3:
                topElement(st1);
                case 4:
                minElement(st2);
            }
            n=n-1;
        }
    }
}
